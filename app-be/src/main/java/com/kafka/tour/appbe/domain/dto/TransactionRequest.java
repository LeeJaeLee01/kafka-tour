package com.kafka.tour.appbe.domain.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonNaming(PropertyNamingStrategy.class)
public class TransactionRequest {
    private String debitAccount;
    private String creditAccount;
    private BigDecimal amount;
}
