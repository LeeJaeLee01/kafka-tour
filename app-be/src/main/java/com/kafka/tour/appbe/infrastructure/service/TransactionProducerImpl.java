package com.kafka.tour.appbe.infrastructure.service;

import com.kafka.tour.appbe.domain.constant.EventType;
import com.kafka.tour.appbe.domain.constant.MessageCode;
import com.kafka.tour.appbe.domain.event.TransactionEvent;
import com.kafka.tour.appbe.domain.service.TransactionProducer;
import com.kafka.tour.appbe.domain.utils.MessageBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TransactionProducerImpl implements TransactionProducer {
    @Value("${kafka.transaction}")
    private String transactionTopic;

    @Value("${application-name}")
    private String serviceId;

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(TransactionEvent transactionEvent) {
        try {
            var message = MessageBuilder.build(
                    serviceId,
                    EventType.EVENT,
                    MessageCode.FUND_TRANSFER.getCode(),
                    transactionEvent
            );

            kafkaTemplate.send(transactionTopic, message);
            log.info("Produced a message to topic: {}, value: {}", transactionTopic, transactionEvent);
        } catch (Exception e) {
            log.error("Failed to produce the message to topic: " + transactionTopic);
            e.printStackTrace();
        }
    }
}
