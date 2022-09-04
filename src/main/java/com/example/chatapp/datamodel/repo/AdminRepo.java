package com.example.chatapp.datamodel.repo;

import com.example.chatapp.datamodel.Admin;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdminRepo extends PagingAndSortingRepository<Admin , Long> {

    Admin findByEmailAndPassword(String email,String password);
    Admin findByEmail(String email);
}
