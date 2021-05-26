package com.example.cleanarchi.use_cases.product;

import com.example.cleanarchi.infra.dao.ProductCatalogRepository;
import com.example.cleanarchi.model.product.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetAllProducts {
    private final ProductCatalogRepository productRepository;

    public GetAllProducts(ProductCatalogRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductInfo> execute(){
        return productRepository.getAllProduct();
    }
}
