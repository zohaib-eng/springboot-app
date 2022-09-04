package com.example.chatapp.domain.Inbound;

public class LoginClientDTOIn {
    String email;

    String password;


    public LoginClientDTOIn(){
    }

    public LoginClientDTOIn(String email,String password){
        this.email=email;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
