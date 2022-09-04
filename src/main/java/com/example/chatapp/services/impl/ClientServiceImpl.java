package com.example.chatapp.services.impl;

import com.example.chatapp.datamodel.Client;
import com.example.chatapp.datamodel.MessageSender;
import com.example.chatapp.datamodel.repo.ClientRepo;
import com.example.chatapp.datamodel.repo.MessageRepo;
import com.example.chatapp.domain.Inbound.ClientDTOIn;
import com.example.chatapp.domain.Inbound.LoginClientDTOIn;
import com.example.chatapp.domain.LoginClientDTO;
import com.example.chatapp.services.IClientService;
import com.example.chatapp.services.exception.ClientException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    ClientRepo clientRepo;

    @Override
    public void createClient(ClientDTOIn clientDTOIn) {

        Client ct = clientRepo.findByEmail(clientDTOIn.getEmail());

        if(ct != null)
            throw new ClientException("Client already exist");

        String hashPassword = getHashPassword(clientDTOIn.getPassword());
        Client c=new Client();
        c.setName(clientDTOIn.getName());
        c.setEmail(clientDTOIn.getEmail());
        c.setPassword(clientDTOIn.getPassword());
        c.setPassword(hashPassword);

        clientRepo.save(c);

        System.out.println("hello");
    }




    private String getHashPassword(String password) {
        String hashPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();
            hashPassword = DatatypeConverter.printHexBinary(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashPassword;
    }




}
