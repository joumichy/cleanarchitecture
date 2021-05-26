package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "prices")
@Table(name ="prices")
public class PricesEntity {
    @Id
    @NotNull
    @Column(name = "id")
    private Integer priceId;

    @NotNull
    @Column(name = "upadate_date")
    private Date updateDate;

//    @OneToOne(mappedBy = "PricesEntity")
//    private ProductCatalogEntity productCatalogEntity;

    @NotNull
    @Column(name = "updatedate")
    private String updatedate;


    @NotNull
    @Column(name = "price")
    private Double price;

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

//    public ProductCatalogEntity getProductCatalogEntity() {
//        return productCatalogEntity;
//    }
//
//    public void setProductCatalogEntity(ProductCatalogEntity productCatalogEntity) {
//        this.productCatalogEntity = productCatalogEntity;
//    }
//
    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PricesEntity() {
    }
}

