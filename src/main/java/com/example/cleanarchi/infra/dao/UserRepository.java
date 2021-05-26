package com.example.cleanarchi.infra.dao;


import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.model.IUserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>, IUserRepository {

    @Query(value = "Select * from users where idusers=:idusers", nativeQuery = true)
    UserEntity getUserInfo(Integer idusers);

    default List<UserEntity> getAllUserInfo(){
        return findAll();
    }

}
