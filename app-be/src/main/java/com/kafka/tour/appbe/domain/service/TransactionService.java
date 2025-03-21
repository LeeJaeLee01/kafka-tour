package com.kafka.tour.appbe.domain.service;

import com.kafka.tour.appbe.domain.constant.TransactionStatus;
import com.kafka.tour.appbe.domain.constant.TransactionType;
import com.kafka.tour.appbe.domain.dto.TransactionRequest;
import com.kafka.tour.appbe.domain.event.TransactionEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionProducer transactionProducer;

    public TransactionEvent execute(TransactionRequest transactionRequest) {
        var transactionId = UUID.randomUUID().toString();

        var transaction = TransactionEvent.builder()
                .transactionId(transactionId)
                .transactionType(TransactionType.PAYMENT.getType())
                .debitAccount(transactionRequest.getDebitAccount())
                .creditAccount(transactionRequest.getCreditAccount())
                .amount(transactionRequest.getAmount())
                .status(TransactionStatus.SUCCESSFUL.getStatus())
                .createdAt(System.currentTimeMillis())
                .build();

        transactionProducer.send(transaction);

        return transaction;
    }
}
