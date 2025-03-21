package com.kafka.tour.appbe.domain.utils;

import com.kafka.tour.appbe.domain.constant.EventType;
import dev.ronin_engineer.kafka.common.dto.KafkaMessage;
import dev.ronin_engineer.kafka.common.dto.MessageMeta;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MessageBuilder {
    public static <T> KafkaMessage<T> build(String serviceId, EventType eventType, String messageCode, T payload) {
        KafkaMessage<T> message = new KafkaMessage();
        MessageMeta meta = MessageMeta.builder().messageId(generateMessageId()).serviceId(serviceId).type(eventType).timestamp(System.currentTimeMillis()).build();
        message.setMeta(meta);
        message.setMessageCode(messageCode);
        message.setPayload(payload);
        return message;
    }
