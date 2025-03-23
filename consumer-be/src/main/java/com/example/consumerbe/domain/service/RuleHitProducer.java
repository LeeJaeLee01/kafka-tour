package com.example.consumerbe.domain.service;

import com.example.consumerbe.domain.event.RuleHitEvent;

public interface RuleHitProducer {
    void send(RuleHitEvent event);
}
