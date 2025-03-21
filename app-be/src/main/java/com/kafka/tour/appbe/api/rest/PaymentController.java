package com.kafka.tour.appbe.api.rest;

import com.kafka.tour.appbe.domain.dto.TransactionRequest;
import com.kafka.tour.appbe.domain.event.TransactionEvent;
import com.kafka.tour.appbe.domain.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final TransactionService transactionService;

    @PostMapping
    public TransactionEvent createTransaction(@RequestBody TransactionRequest transactionRequest) {
        return transactionService.execute(transactionRequest);
    }
}


