package com.example.cleanarchi.model.product;

import com.example.cleanarchi.infra.entity.ProductCatalogEntity;

public class ProductInfo {

    private String name;
    private String description;
    private String category;
    private Integer details;

    public  ProductInfo(){};

    public void setEntityToInfo(ProductCatalogEntity entity){
        this.name = entity.getName();
        this.description= entity.getDescription();
        this.category = entity.getCategory();
        this.details = entity.getDetails();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Integer getDetails() {
        return details;
    }
}
