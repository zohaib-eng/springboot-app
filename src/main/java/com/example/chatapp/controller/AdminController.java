package com.example.chatapp.controller;

import com.example.chatapp.domain.Inbound.AdminDTOIn;
import com.example.chatapp.domain.Inbound.LoginAdminDTOIn;
import com.example.chatapp.domain.LoginAdminDTO;
import com.example.chatapp.services.IAdminService;
import com.example.chatapp.services.exception.AdminException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class AdminController {

    @Autowired
    IAdminService adminService;

    @PostMapping("/admin")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdmin(@RequestBody AdminDTOIn adminDTOIn) throws AdminException {
        adminService.createAdmin(adminDTOIn);
    }

    @GetMapping("/adminlogin")
    public LoginAdminDTO loginAdminDTO(@RequestBody LoginAdminDTOIn loginAdminDTOIn){
        return adminService.login(loginAdminDTOIn);
    }



    @ExceptionHandler(AdminException.class)
    public ResponseEntity<Object> handleAdminException() {
        System.out.println("exception received.");
        HashMap<String, String> res = new HashMap<>();
        res.put("message", " Admin already exist. ");
        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }
}
