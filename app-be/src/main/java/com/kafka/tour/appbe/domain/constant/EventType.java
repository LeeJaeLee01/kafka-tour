package com.kafka.tour.appbe.domain.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EventType {
    COMMAND("COMMAND"),
    EVENT("EVENT");

    private final String type;
}
