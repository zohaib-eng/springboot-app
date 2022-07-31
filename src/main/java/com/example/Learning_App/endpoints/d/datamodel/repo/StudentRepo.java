package com.example.Learning_App.endpoints.d.datamodel.repo;

import com.example.Learning_App.endpoints.d.datamodel.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepo extends PagingAndSortingRepository<Student, Long> {

    Student findByEmailAndPassword(String email, String password);

}
