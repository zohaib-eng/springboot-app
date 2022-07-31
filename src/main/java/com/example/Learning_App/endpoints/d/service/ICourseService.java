package com.example.Learning_App.endpoints.d.service;

import com.example.Learning_App.endpoints.d.domain.Inbound.CourseDTOIn;

public interface ICourseService {

    void createCourse(CourseDTOIn courseDTOIn);
}
