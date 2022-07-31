package com.example.Learning_App.endpoints.d.service.impl;

import com.example.Learning_App.endpoints.d.datamodel.Course;
import com.example.Learning_App.endpoints.d.datamodel.repo.CourseRepo;
import com.example.Learning_App.endpoints.d.domain.Inbound.CourseDTOIn;
import com.example.Learning_App.endpoints.d.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    CourseRepo courseRepo;
    @Override
    public void createCourse(CourseDTOIn courseDTOIn) {
        Course c1=new Course();
        c1.setName(courseDTOIn.getName());
        c1.setCode(courseDTOIn.getCode());
        c1.setDescription(courseDTOIn.getDescription());

        courseRepo.save(c1);
    }

    public Course getCourseById(String id) {
        return courseRepo.findById(id);
    }

}
