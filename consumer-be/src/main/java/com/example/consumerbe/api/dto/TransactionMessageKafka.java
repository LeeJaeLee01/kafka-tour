package com.example.consumerbe.api.dto;

import com.example.consumerbe.domain.event.TransactionEvent;
import dev.ronin_engineer.kafka.common.dto.KafkaMessage;

public class TransactionMessageKafka extends KafkaMessage<TransactionEvent> {
}
