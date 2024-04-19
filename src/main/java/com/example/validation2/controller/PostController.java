package com.example.validation2.controller;

import com.example.validation2.model.UserRegister;
import com.example.validation2.service.UserService;
import jakarta.validation.Valid;
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

    @PostMapping("/post1") //화면출력
    public UserRegister saveUser(@Valid @RequestBody UserRegister userRegister){
        System.out.println(userRegister);
        userService.saveUser(userRegister);
        return userRegister;
    }

    @PostMapping("/post2")
    public void saveUser2(@Valid @RequestBody UserRegister userRegister){
        userService.saveUser(userRegister);
    }
}
