package com.yourname.yourfirstname.dto;

public class MessageResponse {
    private String message;

    // Constructors
    public MessageResponse() {}

    public MessageResponse(String message) {
        this.message = message;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
