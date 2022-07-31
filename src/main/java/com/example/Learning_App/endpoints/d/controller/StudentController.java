package com.example.Learning_App.endpoints.d.controller;

import com.example.Learning_App.endpoints.d.domain.Inbound.LoginDTOIn;
import com.example.Learning_App.endpoints.d.domain.Inbound.StudentDTOIn;
import com.example.Learning_App.endpoints.d.domain.LoginDTO;
import com.example.Learning_App.endpoints.d.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDTOIn studentDTOIn) {
        studentService.createStudent(studentDTOIn);
    }

    @GetMapping("/login")
    public LoginDTO login(@RequestBody LoginDTOIn loginDTOIn) {
        return studentService.login(loginDTOIn);
    }
}
