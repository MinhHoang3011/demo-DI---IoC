package com.example.demodiioc;

import com.example.demodiioc.controller.UserController;
import com.example.demodiioc.service.MessageService;

import javax.management.InstanceNotFoundException;

public class DependencyInjectionPatternExample {
    public static void main(String[] args) throws InstanceNotFoundException {
        MessageService messageService = (MessageService) Injector.getInstance("messageService");
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
