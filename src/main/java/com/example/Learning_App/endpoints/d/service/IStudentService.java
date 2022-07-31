package com.example.Learning_App.endpoints.d.service;


import com.example.Learning_App.endpoints.d.domain.Inbound.LoginDTOIn;
import com.example.Learning_App.endpoints.d.domain.Inbound.StudentDTOIn;
import com.example.Learning_App.endpoints.d.domain.LoginDTO;

public interface IStudentService {

    void createStudent(StudentDTOIn studentDTOIn);

    LoginDTO login(LoginDTOIn loginDTOIn);
}
