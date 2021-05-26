package com.example.cleanarchi.model.user;

import com.example.cleanarchi.infra.entity.UserEntity;

public class UserInfo {

    private String name;
    private String login;
    private String password;

    public UserInfo(){

    }

    public void UserEntityToUserInfo(UserEntity userEntity){
        this.login = userEntity.getLogin();
        this.name = userEntity.getName();
        this.password = userEntity.getPassword();
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
