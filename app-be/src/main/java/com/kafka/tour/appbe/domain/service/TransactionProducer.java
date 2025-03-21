package com.kafka.tour.appbe.domain.service;

import com.kafka.tour.appbe.domain.event.TransactionEvent;
import org.springframework.stereotype.Component;

@Component
public interface TransactionProducer {
    void send(TransactionEvent transactionEvent);
}
