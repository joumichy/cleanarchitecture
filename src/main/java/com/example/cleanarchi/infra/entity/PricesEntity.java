package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "prices")
@Table(name ="prices")
public class PricesEntity {

    @Id
    @NotNull
    @Column(name = "idproductprices")
    private Integer idproductprices;


    @NotNull
    @Column(name = "updatedate")
    private String updatedate;


    @NotNull
    @Column(name = "price")
    private Double price;

}

