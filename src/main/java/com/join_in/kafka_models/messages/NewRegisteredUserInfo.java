package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record NewRegisteredUserInfo(
        String identity,
        String firstName,
        String lastName
) implements KafkaMessage {
}
