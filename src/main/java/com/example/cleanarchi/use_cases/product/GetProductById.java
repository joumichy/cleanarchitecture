package com.example.cleanarchi.use_cases.product;

import com.example.cleanarchi.infra.dao.ProductCatalogRepository;
import com.example.cleanarchi.infra.entity.ProductCatalogEntity;
import com.example.cleanarchi.model.product.ProductInfo;
import org.springframework.stereotype.Service;

@Service
public class GetProductById {

    private final ProductCatalogRepository productRepository;

    public GetProductById(ProductCatalogRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductInfo execute(Integer idProduct){
        return productRepository.getProductById(idProduct);
    }

}
