package com.example.validation2.controller;

import com.example.validation2.model.UserRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

//1
@Slf4j
@RestController
@RequestMapping("api2/user")
public class UserApiController {

    @PostMapping("")
    public UserRegister register(@RequestBody UserRegister userRegister){

        log.info("user request: {}", userRegister);// 요청이 들어온 파라미터를 로그로 찍음
        return userRegister;
    }
}
