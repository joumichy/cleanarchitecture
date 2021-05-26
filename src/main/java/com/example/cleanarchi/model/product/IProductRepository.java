package com.example.cleanarchi.model.product;

import java.util.List;

public interface IProductRepository {

    ProductInfo getProductById(Integer id);
    List<ProductInfo> getAllProduct();
}
