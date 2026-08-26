package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record UpdateProfileImage(
        String identity,
        byte[] profileImage
) implements KafkaMessage {
}
