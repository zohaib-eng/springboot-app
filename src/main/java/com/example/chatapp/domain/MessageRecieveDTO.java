package com.example.chatapp.domain;

import com.example.chatapp.domain.Inbound.MessageSenderDTOIn;

public class MessageRecieveDTO extends MessageSenderDTOIn {
    Boolean recieve;

    public MessageRecieveDTO(String message,String name,boolean recieve){
        super(message,name);
        this.recieve=recieve;
    }

    public Boolean getRecieve() {
        return recieve;
    }

    public void setRecieve(Boolean recieve) {
        this.recieve = recieve;
    }
}
