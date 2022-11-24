package com.example.demodiioc.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email message: " + message);
    }
}
