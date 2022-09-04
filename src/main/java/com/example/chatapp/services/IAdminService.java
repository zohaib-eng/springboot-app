package com.example.chatapp.services;

import com.example.chatapp.domain.Inbound.AdminDTOIn;
import com.example.chatapp.domain.Inbound.LoginAdminDTOIn;
import com.example.chatapp.domain.LoginAdminDTO;
import com.example.chatapp.services.exception.AdminException;

public interface IAdminService {
    void createAdmin(AdminDTOIn adminDTOIn) throws AdminException;

    LoginAdminDTO login(LoginAdminDTOIn loginAdminDTOIn);

}


