package com.example.cleanarchi.use_cases;

import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.infra.dao.UserRepository;
import com.example.cleanarchi.model.user.UserInfo;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;


@Service
public class GetUserInfo {

    private final UserRepository userRepository;

    public GetUserInfo(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserInfo execute(Integer idusers){
        return userRepository.getUserInformation(idusers);
    }
}
