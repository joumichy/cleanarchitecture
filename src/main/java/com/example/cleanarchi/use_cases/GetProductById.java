package com.example.cleanarchi.use_cases;

import com.example.cleanarchi.infra.dao.ProductCatalogRepository;
import com.example.cleanarchi.infra.entity.ProductCatalogEntity;
import org.springframework.stereotype.Service;

@Service
public class GetProductById {

    private final ProductCatalogRepository productRepository;

    public GetProductById(ProductCatalogRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductCatalogEntity execute(Integer idProduct){
        return productRepository.getById(idProduct);
    }

}
