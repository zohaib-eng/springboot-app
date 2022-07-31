package com.beblogy.pos.endPoints.services;

import com.beblogy.pos.endPoints.datamodel.User;
import com.beblogy.pos.endPoints.domain.dto.UserDTO;
import com.beblogy.pos.endPoints.domain.dto.inbound.UserDTOIn;

import java.util.List;

public interface IUserService {

    UserDTO createUser(UserDTOIn userDTOIn);

    List<UserDTO> getAllUsers();

    List<User> getAllUserss();
}
