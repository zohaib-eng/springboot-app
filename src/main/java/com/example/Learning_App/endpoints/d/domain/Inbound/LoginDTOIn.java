package com.example.Learning_App.endpoints.d.domain.Inbound;

public class LoginDTOIn {

    String email;
    String password;

    public LoginDTOIn() {
    }

    public LoginDTOIn(String email, String password) {
        this.email = email;
        this.password = password;
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
