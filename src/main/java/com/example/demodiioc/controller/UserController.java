package com.example.demodiioc.controller;

import com.example.demodiioc.service.EmailService;
import com.example.demodiioc.service.MessageService;

public class UserController {
    private MessageService messageService;

    public UserController(MessageService messageService){
        this.messageService = messageService;
    }
    public void send(){
        messageService.sendMessage("Hello Dependency injection pattern");
    }
}
