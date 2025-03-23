package com.example.producerbe.domain.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TransactionStatus {
    INIT(0),
    SUCCESSFUL(1),
    FAILED(-1);

    private final int status;
}
