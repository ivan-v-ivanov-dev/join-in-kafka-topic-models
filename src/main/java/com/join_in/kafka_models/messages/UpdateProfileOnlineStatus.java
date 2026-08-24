package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record UpdateProfileOnlineStatus(
        String identity
) implements KafkaMessage {
}
