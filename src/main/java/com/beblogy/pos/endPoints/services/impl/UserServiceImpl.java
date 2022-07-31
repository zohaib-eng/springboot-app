package com.beblogy.pos.endPoints.services.impl;

import com.beblogy.pos.endPoints.datamodel.User;
import com.beblogy.pos.endPoints.datamodel.repo.UserRepo;
import com.beblogy.pos.endPoints.domain.dto.UserDTO;
import com.beblogy.pos.endPoints.domain.dto.inbound.UserDTOIn;
import com.beblogy.pos.endPoints.services.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDTO createUser(UserDTOIn userDTOIn) {
        User user = new User();
        user.setEmail(userDTOIn.getEmail());
        user.setPassword(userDTOIn.getPassword());
        user.setName(userDTOIn.getUserName());

        if(userRepo.existsByEmail(userDTOIn.getEmail()))
            throw new EntityNotFoundException("");

        user = userRepo.save(user);

        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setUserName(user.getName());
        userDTO.setCreated(Boolean.TRUE);

        return userDTO;
    }

    public List<UserDTO> getAllUsers() {
        return userRepo.findAllUser();
    }

    @Override
    public List<User> getAllUserss() {
        Iterator<User> it = userRepo.findAll().iterator();

        List<User> users = new ArrayList<>();

        while(it.hasNext()) {
            users.add(it.next());
        }

        return users;
    }
}
