package com.example.cleanarchi.infra.controller;

import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.use_cases.GetAllUsersInfo;
import com.example.cleanarchi.use_cases.GetUserInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final GetUserInfo getUserInfo;
    private final GetAllUsersInfo getAllUsersInfo;

    public UserController(GetUserInfo getUserInfo, GetAllUsersInfo getAllUsersInfo) {
        this.getUserInfo = getUserInfo;
        this.getAllUsersInfo = getAllUsersInfo;
    }

    @GetMapping(value = "test/{cle}")
    public String test(@PathVariable(name ="cle") String cle){
        return cle;
    }

    @GetMapping(value = {"{id}"})
    public ResponseEntity<?> getUserInfoById(@PathVariable(name ="id") Integer id){
        if(id != null){
            UserEntity user = getUserInfo.execute(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Nope", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value ="/all")
    public ResponseEntity<?> getAllUsersInfo(){
        try{
            List<UserEntity> users = getAllUsersInfo.execute();
            return new ResponseEntity<>(users, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
}
