package com.reto3.controllers;

import com.reto3.entities.Message;
import com.reto3.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/all")
    public List<Message> getMessages(){
        return messageService.getAll();
    }

    @PostMapping("/save")
    public Message postMessage(@RequestBody Message message){
        return messageService.save(message);
    }
}
