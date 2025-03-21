package com.kafka.tour.appbe.domain.event;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@JsonNaming(PropertyNamingStrategy.class)
public class TransactionEvent {
    private String transactionId;
    private String transactionType;
    private String debitAccount;
    private String creditAccount;
    private BigDecimal amount;
    private Integer status;
    private Long createdAt;
}
