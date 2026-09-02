package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record PostImage(
        String postIdentity,
        String imageIdentity,
        byte[] imageBytes
) implements KafkaMessage {
}
