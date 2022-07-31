package com.example.Learning_App.endpoints.d.domain;

import com.example.Learning_App.endpoints.d.domain.Inbound.LoginDTOIn;

public class LoginDTO extends LoginDTOIn {

    Boolean login;

    LoginDTO () {
    }

    public LoginDTO(String email, String password, Boolean login) {
        super(email, password);
        this.login = login;
    }

    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }
}
