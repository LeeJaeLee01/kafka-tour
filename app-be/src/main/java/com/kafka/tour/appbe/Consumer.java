package com.kafka.tour.appbe;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Slf4j
@Component
@Repository
public class Consumer {
    @KafkaListener(topics = "${kafka.inbound-topic}")
    public void listen(@Header(KafkaHeaders.RECEIVED_TOPIC) String topic, @Header(KafkaHeaders.RECEIVED_PARTITION) int partition, @Header(KafkaHeaders.RECEIVED_KEY) String key, @Payload String value) {
        log.info("Received message: {}", value);


    }
}
