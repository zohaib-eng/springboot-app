package com.beblogy.pos.endPoints.controller;

import com.beblogy.pos.endPoints.datamodel.User;
import com.beblogy.pos.endPoints.domain.dto.UserDTO;
import com.beblogy.pos.endPoints.domain.dto.inbound.UserDTOIn;
import com.beblogy.pos.endPoints.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public/users")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/home")
    String name() {
        return "I'm at home";
    }

    @PostMapping("/singup")
    UserDTO signUp(@RequestBody UserDTOIn userDTOIn) {
        UserDTO userDTO = userService.createUser(userDTOIn);

        return userDTO;
    }

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/userss")
    public List<User> getAllUserss() {
        return userService.getAllUserss();
    }
}
