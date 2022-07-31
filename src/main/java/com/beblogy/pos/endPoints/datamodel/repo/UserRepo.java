package com.beblogy.pos.endPoints.datamodel.repo;

import com.beblogy.pos.endPoints.datamodel.User;
import com.beblogy.pos.endPoints.domain.dto.UserDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepo extends PagingAndSortingRepository<User, Long> {

    Boolean existsByEmail(String email);

    @Query("select new com.beblogy.pos.endPoints.domain.dto.UserDTO( email, name ) from User")
    List<UserDTO> findAllUser();


}