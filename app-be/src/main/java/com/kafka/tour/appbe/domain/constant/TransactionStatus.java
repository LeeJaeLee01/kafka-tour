package com.kafka.tour.appbe.domain.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TransactionStatus {
    INIT(0),
    SUCCESSFUL(1),
    FAILED(-1);

    private final int status;
}
