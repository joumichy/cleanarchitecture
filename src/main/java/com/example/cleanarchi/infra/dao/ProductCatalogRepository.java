package com.example.cleanarchi.infra.dao;

import com.example.cleanarchi.infra.controller.ProductCatalogController;
import com.example.cleanarchi.infra.entity.ProductCatalogEntity;
import com.example.cleanarchi.infra.entity.UserEntity;
import com.example.cleanarchi.model.product.IProductRepository;
import com.example.cleanarchi.model.product.ProductInfo;
import com.example.cleanarchi.model.user.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductCatalogRepository extends JpaRepository<ProductCatalogEntity, Integer>, IProductRepository {

    @Override
    default ProductInfo getProductById(Integer id){
        List<ProductCatalogEntity> productCatalogEntityList = findAll();
        ProductInfo productInfo = new ProductInfo();
        for (ProductCatalogEntity productCatalogEntity: productCatalogEntityList) {
            if(productCatalogEntity.getIdproduct().equals(id)) {
                productInfo.setEntityToInfo(productCatalogEntity); ;
            }

        }
        return productInfo;
    }

    @Override
    default List<ProductInfo> getAllProduct(){
        List<ProductCatalogEntity> productCatalogEntities = findAll();
        List<ProductInfo> productInfos = new ArrayList<>();
        for(ProductCatalogEntity productCatalogEntity : productCatalogEntities){
            ProductInfo productInfo = new ProductInfo();
            productInfo.setEntityToInfo(productCatalogEntity);
            productInfos.add(productInfo);
        }
        return productInfos;
    }
}

