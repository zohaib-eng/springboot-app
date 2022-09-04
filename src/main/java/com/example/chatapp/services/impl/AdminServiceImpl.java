package com.example.chatapp.services.impl;

import com.example.chatapp.datamodel.Admin;
import com.example.chatapp.datamodel.repo.AdminRepo;
import com.example.chatapp.domain.Inbound.AdminDTOIn;
import com.example.chatapp.domain.Inbound.LoginAdminDTOIn;
import com.example.chatapp.domain.LoginAdminDTO;
import com.example.chatapp.services.IAdminService;
import com.example.chatapp.services.exception.AdminException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    AdminRepo adminRepo;

            public void createAdmin(AdminDTOIn adminDTOIn){

                Admin ad = adminRepo.findByEmail(adminDTOIn.getEmail());

                if(ad != null)
                    throw new AdminException("admin already exist");

                String hashPassword = getHashPassword(adminDTOIn.getPassword());

                Admin a=new Admin();
                a.setName(adminDTOIn.getName());
                a.setEmail(adminDTOIn.getEmail());
                a.setPassword(adminDTOIn.getPassword());
                a.setPassword(hashPassword);

                adminRepo.save(a);
            }


    private String getHashPassword(String password) {
        String hashPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();
            hashPassword = DatatypeConverter.printHexBinary(digest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashPassword;
    }

    @Override
    public LoginAdminDTO login(LoginAdminDTOIn loginAdminDTOIn) {
        String hashPassword = getHashPassword(loginAdminDTOIn.getPassword());
        LoginAdminDTO loginAdminDTO=new LoginAdminDTO(loginAdminDTOIn.getEmail(),loginAdminDTOIn.getPassword(),false);
        Admin a=adminRepo.findByEmailAndPassword(loginAdminDTOIn.getEmail(), hashPassword);
        if(a!=null){

            loginAdminDTO.setLogin(true);

        }
        return loginAdminDTO;
    }
}
