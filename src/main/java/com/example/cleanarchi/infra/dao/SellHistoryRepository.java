package com.example.cleanarchi.infra.dao;

import com.example.cleanarchi.infra.entity.SellHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellHistoryRepository  extends JpaRepository<SellHistoryEntity, Integer> {
}
