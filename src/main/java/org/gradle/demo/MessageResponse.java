package org.gradle.demo;

import com.google.gson.annotations.Since;

public class MessageResponse {
    @Since(1.0) private String message;

    public MessageResponse() {}

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}