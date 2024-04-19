package com.example.validation2.controller;

import com.example.validation2.model.UserRegister;
import com.example.validation2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class PutController {
    @Autowired
    UserService userService;
    @PutMapping("/{id}")
    public UserRegister putUser(@PathVariable UserRegister userRegister,
                                @PathVariable int id){
        System.out.println(id);
        System.out.println(userRegister);
        userService.updateUser(id,userRegister);
        return  userRegister;
    }
}
