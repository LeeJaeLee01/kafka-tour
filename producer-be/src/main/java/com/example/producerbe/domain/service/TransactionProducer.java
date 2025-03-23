package com.example.producerbe.domain.service;

import com.example.producerbe.domain.event.TransactionEvent;
import org.springframework.stereotype.Component;

@Component
public interface TransactionProducer {
    void send(TransactionEvent transactionEvent);
}
