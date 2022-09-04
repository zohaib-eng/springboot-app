package com.example.chatapp.controller;

import com.example.chatapp.domain.Inbound.MessageRecieveDTOIn;
import com.example.chatapp.domain.Inbound.MessageSenderDTOIn;
import com.example.chatapp.domain.MessageRecieveDTO;
import com.example.chatapp.services.IMessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.InputMismatchException;

@RestController
public class MessageSenderController {
    @Autowired
    IMessageSenderService messageSenderService;



    @PostMapping("/message")
    @ResponseStatus(HttpStatus.CREATED)
    public void Message(@RequestBody MessageSenderDTOIn messageSenderDTOIn){
        messageSenderService.createMessageSender(messageSenderDTOIn);
    }

    @GetMapping("/recieve")
    public MessageRecieveDTO  messageRecieveDTO(@RequestBody MessageRecieveDTOIn messageRecieveDTOIn){
        return messageSenderService.message(messageRecieveDTOIn);
    }


}
