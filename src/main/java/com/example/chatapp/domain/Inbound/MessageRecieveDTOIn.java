package com.example.chatapp.domain.Inbound;

public class MessageRecieveDTOIn {
    String message;
    String name;

    public MessageRecieveDTOIn(){
    }

    public MessageRecieveDTOIn(String message){
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
