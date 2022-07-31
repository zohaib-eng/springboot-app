package com.example.Learning_App.endpoints.d.service.impl;

import com.example.Learning_App.endpoints.d.datamodel.Student;
import com.example.Learning_App.endpoints.d.datamodel.repo.StudentRepo;
import com.example.Learning_App.endpoints.d.domain.Inbound.LoginDTOIn;
import com.example.Learning_App.endpoints.d.domain.Inbound.StudentDTOIn;
import com.example.Learning_App.endpoints.d.domain.LoginDTO;
import com.example.Learning_App.endpoints.d.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalTime;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void createStudent(StudentDTOIn studentDTOIn) {

        String hashPassword = getHashPassword(studentDTOIn.getPassword());

        Student std = new Student();
        std.setEmail(studentDTOIn.getEmail());
        std.setRoll_No(studentDTOIn.getRollNo());
        std.setName(studentDTOIn.getName());
        std.setPassword(hashPassword);

        studentRepo.save(std);
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
    public LoginDTO login(LoginDTOIn loginDTOIn) {

        String hashPassword = getHashPassword(loginDTOIn.getPassword());

        LoginDTO loginDTO = new LoginDTO(loginDTOIn.getEmail(), loginDTOIn.getPassword(), false);

        Student std = studentRepo.findByEmailAndPassword(loginDTOIn.getEmail(), hashPassword);
        if(std != null){
            loginDTO.setLogin(true);
        }

        return loginDTO;
    }
}
