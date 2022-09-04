package com.example.chatapp.services;

import com.example.chatapp.domain.Inbound.ClientDTOIn;
import com.example.chatapp.domain.Inbound.LoginClientDTOIn;
import com.example.chatapp.domain.LoginClientDTO;

public interface IClientService {
    void createClient(ClientDTOIn clientDTOIn);

    //LoginClientDTO login(LoginClientDTOIn loginClientDTOIn);
    //Boolean isClient1Role(String Name);

    //Boolean ismessage(String Name);
}
