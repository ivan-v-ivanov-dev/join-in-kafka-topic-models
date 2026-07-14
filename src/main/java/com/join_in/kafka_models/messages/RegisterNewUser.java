package com.join_in.kafka_models.messages;

import com.join_in.kafka_models.KafkaMessage;

public class RegisterNewUser implements KafkaMessage {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public RegisterNewUser() {}

    public RegisterNewUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
