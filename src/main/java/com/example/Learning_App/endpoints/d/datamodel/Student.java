package com.example.Learning_App.endpoints.d.datamodel;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registeration")
public class Student {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    String id;

    String name;

    String Roll_No;

    String email;

    String password;

    public Student() {
    }

    public Student(String id, String name,String Roll_No, String email, String password) {
        this.id = id;
        this.name = name;
        this.Roll_No=Roll_No;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(String Roll_No) {
        this.Roll_No = Roll_No;
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
