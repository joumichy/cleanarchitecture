package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "detail")
@Table(name ="detail")
public class Detail {
    @Id
    @NotNull
    @Column(name = "iddetail")
    private Integer iddetail;

    @NotNull
    @Column(name = "value")
    private String value;



}
