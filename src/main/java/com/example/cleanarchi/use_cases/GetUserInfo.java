package com.example.cleanarchi.use_cases;

import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.infra.dao.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class GetUserInfo {

    private final UserRepository userRepository;

    public GetUserInfo(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserEntity execute(Integer idusers){
        return userRepository.getUserInfo(idusers);
    }
}
