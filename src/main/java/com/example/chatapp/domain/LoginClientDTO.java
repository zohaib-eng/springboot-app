package com.example.chatapp.domain;

import com.example.chatapp.domain.Inbound.LoginClientDTOIn;

public class LoginClientDTO extends LoginClientDTOIn{
    Boolean login;

    //public LoginClientDTO(){
    //}


    public LoginClientDTO(String email,String password,Boolean login){
        super(email,password);
        this.login=login;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }
}
