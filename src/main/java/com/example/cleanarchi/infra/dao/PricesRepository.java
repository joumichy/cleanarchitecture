package com.example.cleanarchi.infra.dao;

import com.example.cleanarchi.infra.entity.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepository extends JpaRepository <PricesEntity, Integer> {
}
