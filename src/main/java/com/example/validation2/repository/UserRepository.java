package com.example.validation2.repository;

import com.example.validation2.model.UserRegister;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class UserRepository {
    private Map<Integer,UserRegister> db = new HashMap<>();
    private int id = 1;

    public List<UserRegister> findAllUsers(){
        return new ArrayList<>(db.values());
    }
    public UserRegister findOneUser(int idx){
        return db.get(idx);
    }
    public void saveUser(UserRegister userRegister){
        db.put(id++, userRegister);
    }
    public void deleteUser(int id){
        db.remove(id);
    }
    public void userRegister(int id, UserRegister userRegister){
        db.put(id, userRegister);
    }

}
