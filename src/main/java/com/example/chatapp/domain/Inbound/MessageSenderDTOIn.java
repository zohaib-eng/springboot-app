package com.example.chatapp.domain.Inbound;

public class MessageSenderDTOIn {
    String message;
    String name;

    public MessageSenderDTOIn(){
    }

    public MessageSenderDTOIn(String message,String name){
        this.message=message;
        this.name=name;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
