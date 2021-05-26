package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity(name = "productcatalog")
@Table(name ="productcatalog")
public class ProductCatalogEntity {
    @Id
    @NotNull
    @Column(name = "idproduct")
    private Integer idproduct;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "category")
    private String category;

    @NotNull
    @Column(name = "details")
    private Integer details;



    public Integer getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getDetails() {
        return details;
    }

    public void setDetails(Integer details) {
        this.details = details;
    }



    public ProductCatalogEntity() {
    }
}
