package com.example.chatapp.domain;

import com.example.chatapp.domain.Inbound.LoginAdminDTOIn;

public class LoginAdminDTO extends LoginAdminDTOIn {
    Boolean login;

    public LoginAdminDTO(){
    }

    public LoginAdminDTO(String email,String password,Boolean login){
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
