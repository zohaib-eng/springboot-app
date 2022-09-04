package com.example.chatapp.controller;


import com.example.chatapp.domain.Inbound.ClientDTOIn;
import com.example.chatapp.domain.Inbound.LoginAdminDTOIn;
import com.example.chatapp.domain.Inbound.LoginClientDTOIn;
import com.example.chatapp.domain.LoginAdminDTO;
import com.example.chatapp.domain.LoginClientDTO;
import com.example.chatapp.services.IClientService;
import com.example.chatapp.services.exception.AdminException;
import com.example.chatapp.services.exception.ClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ClientController {

    @Autowired
    IClientService clientService;
    @PostMapping("/client")
    @ResponseStatus(HttpStatus.CREATED)
    public void Client(@RequestBody ClientDTOIn clientDTOIn){
        clientService.createClient(clientDTOIn);
    }

    @GetMapping("/clientlogin")
    public LoginClientDTO loginClientDTO(@RequestBody LoginClientDTOIn loginClientDTOIn){
       // return clientService.login(loginClientDTOIn);
        return null;
    }


    @ExceptionHandler(ClientException.class)
    public ResponseEntity<Object> handleClientException() {
        System.out.println("exception received.");
        HashMap<String, String> res = new HashMap<>();
        res.put("message", " Client already exist. ");
        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }


}
