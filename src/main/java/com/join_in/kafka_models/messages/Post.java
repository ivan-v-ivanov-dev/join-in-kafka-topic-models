package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

import java.util.List;

public record Post(
        String identity,
        String content,
        byte[] imageBytes,
        String youtubeUrl,
        String pollQuestion,
        List<String> pollOptions
) implements KafkaMessage {
}
