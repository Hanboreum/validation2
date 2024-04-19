package com.example.validation2.controller;

import com.example.validation2.model.UserRegister;
import com.example.validation2.service.UserService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class GetController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<UserRegister> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public UserRegister findOneUser(@PathVariable("id")int id ){
        return userService.findOneUser(id);
    }
}
