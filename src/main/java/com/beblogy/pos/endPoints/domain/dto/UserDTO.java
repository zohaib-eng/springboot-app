package com.beblogy.pos.endPoints.domain.dto;

public class UserDTO {
    String email;
    String userName;
    Boolean created;

    public UserDTO() {
    }

    public UserDTO(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getCreated() {
        return created;
    }

    public void setCreated(Boolean created) {
        this.created = created;
    }
}
