package com.example.producerbe.domain.service;

import com.example.producerbe.domain.constants.TransactionStatus;
import com.example.producerbe.domain.constants.TransactionType;
import com.example.producerbe.domain.dto.TransactionRequest;
import com.example.producerbe.domain.event.TransactionEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionProducer producer;


    public TransactionEvent execute(TransactionRequest request) {
        var transactionId = UUID.randomUUID().toString();

        // fake the execution of the transaction
        var transaction = TransactionEvent.builder()
                .transactionId(transactionId)
                .transactionType(TransactionType.PAYMENT.getType())
                .debitAccount(request.getDebitAccount())
                .creditAccount(request.getCreditAccount())
                .amount(request.getAmount())
                .status(TransactionStatus.SUCCESSFUL.getStatus())
                .createdAt(System.currentTimeMillis())
                .build();

        producer.send(transaction);

        return transaction;
    }
}
