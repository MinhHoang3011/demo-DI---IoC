package com.example.demodiioc.service;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms message" + message);
    }
}
