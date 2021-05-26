package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "prices")
@Table(name ="prices")
public class PricesEntity {
    @Id
    @NotNull
    @Column(name = "id")
    private Integer priceId;

    @NotNull
    @Column(name = "price")
    private int price;

    @NotNull
    @Column(name = "upadate_date")
    private Date updateDate;

    @OneToOne(mappedBy = "PricesEntity")
    private ProductCatalogEntity productCatalogEntity;

}

