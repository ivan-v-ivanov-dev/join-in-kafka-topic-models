package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record Unfriend(
        String profileIdentity,
        String friendIdentity
) implements KafkaMessage {
}
