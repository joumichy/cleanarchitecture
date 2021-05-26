package com.example.cleanarchi.use_cases.user;

import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.infra.dao.UserRepository;
import com.example.cleanarchi.model.user.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GetAllUsersInfo {

    private final UserRepository userRepository;

    public GetAllUsersInfo(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<UserInfo> execute(){
        return userRepository.getAllUsersInfo();
    }
}
