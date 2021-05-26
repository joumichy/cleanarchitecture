package com.example.cleanarchi.infra.dao;

import com.example.cleanarchi.infra.entity.DetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<DetailEntity, Integer> {
}
