package com.example.cleanarchi.infra.dao;

import com.example.cleanarchi.infra.entity.ProductCatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCatalogRepository extends JpaRepository<ProductCatalogEntity, Integer> {
}
