package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record UploadAlbumImage(String identity,
                               byte[] albumImage) implements KafkaMessage {
}
