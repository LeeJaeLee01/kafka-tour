package com.kafka.tour.appbe;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

@Slf4j
@Component
@RequiredArgsConstructor
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String key, String value) {
            kafkaTemplate.send(topic, key, value); // async
//            try {
//                SendResult<String, String> result = kafkaTemplate.send(topic, key, value).get();
//            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
//
//                log.error(e.getMessage());
//            } catch (ExecutionException e) {
//
//                throw new RuntimeException(e);
//            }
    }
}
