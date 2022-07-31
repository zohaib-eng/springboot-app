package com.example.Learning_App.endpoints.d.datamodel.repo;

import com.example.Learning_App.endpoints.d.datamodel.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepo extends PagingAndSortingRepository<Course, Long> {
    Course findById(String id);
}
