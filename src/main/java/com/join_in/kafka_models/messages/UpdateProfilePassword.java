package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record UpdateProfilePassword(
        String identity,
        String password
) implements KafkaMessage {
}
