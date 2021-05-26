package com.example.cleanarchi.infra.dao;


import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.model.user.IUserRepository;
import com.example.cleanarchi.model.user.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>, IUserRepository {

    @Override
    default UserInfo getUserInformation(Integer userId) {
        List<UserEntity> users = findAll();
        UserEntity userEntity = new UserEntity();
        for(UserEntity user : users){
            if(user.getIdusers().equals(userId)) userEntity = user;
        }
        UserInfo userInfo = new UserInfo();
        userInfo.UserEntityToUserInfo(userEntity);
        return userInfo;
    }

    @Override
    default List<UserInfo> getAllUsersInfo(){
        List<UserEntity> userEntities = findAll();
        List<UserInfo> userInfos = new ArrayList<>();
        for(UserEntity user : userEntities){
            UserInfo userInfo = new UserInfo();
            userInfo.UserEntityToUserInfo(user);
            userInfos.add(userInfo);
        }
        return userInfos;
    }

}
