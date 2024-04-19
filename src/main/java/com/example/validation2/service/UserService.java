package com.example.validation2.service;

import com.example.validation2.model.UserRegister;
import com.example.validation2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    @Autowired
    UserService( UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserRegister> findAllUsers(){
        return userRepository.findAllUsers();
    }
    public UserRegister findOneUser(int id){
        return userRepository.findOneUser(id);
    }
    public void saveUser(UserRegister userRegister){
        userRepository.saveUser(userRegister);
    }
    public void deleteUser(int id){
        userRepository.deleteUser(id);
    }
}
