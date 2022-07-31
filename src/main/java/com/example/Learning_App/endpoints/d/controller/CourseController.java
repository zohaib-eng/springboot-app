package com.example.Learning_App.endpoints.d.controller;


import com.example.Learning_App.endpoints.d.configuration.Any;
import com.example.Learning_App.endpoints.d.domain.Inbound.CourseDTOIn;
import com.example.Learning_App.endpoints.d.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    ICourseService courseService;

    @Any(value = "happy")
    @PostMapping("/course")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCourse(@RequestBody CourseDTOIn courseDTOIn){
        courseService.createCourse(courseDTOIn);
    }

}
