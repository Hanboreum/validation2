package com.example.validation2.controller;

import com.example.validation2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class DeleteController {

    @Autowired
    private UserService userService;

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable ("id") int id){
        userService.deleteUser(id);
    }
}
