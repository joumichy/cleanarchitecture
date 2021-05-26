package com.example.cleanarchi.model.user;

import java.util.List;

public interface IUserRepository {

    UserInfo getUserInformation(Integer userId);
    List<UserInfo> getAllUsersInfo();
}
