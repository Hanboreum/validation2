package com.example.validation2.controller;

import com.example.validation2.model.UserRegister;
import com.example.validation2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class PostController {

    @Autowired
    private UserService userService;

    @PostMapping("/post1")
    public UserRegister saveUser(@RequestBody UserRegister userRegister){
        System.out.println(userRegister);
        userService.saveUser(userRegister);
        return userRegister;
    }

    @PostMapping("/post2")
    public void saveUser2( @RequestBody UserRegister userRegister){
        userService.saveUser(userRegister);
    }
}
