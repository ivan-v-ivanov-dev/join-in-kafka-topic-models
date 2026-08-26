package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public record UpdateProfile(String firstName, String lastName, String aboutMe, String mobile, String address,
                            String birthDate, String birthYear, String birthplace, String livesIn, String gender,
                            String interestedIn, String language, String joined, String status, String phoneNumber,
                            String website, String socialLink, String hobbies, String work, String professionalSkills,
                            String college, String currentCity, String hometown,
                            String otherPlacesLived) implements KafkaMessage {
}
