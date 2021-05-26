package com.example.cleanarchi.infra.entity;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name ="sellhistory")
@Table(name = "sellhistory")
public class SellHistoryEntity {


    @Id
    @NotNull
    @Column(name = "idusersellhistory")
    private Integer idusersellhistory;

    @NotNull
    @Column(name = "date")
    private String date;



    @Column(name = "idproductsellhistory")
    private Integer idproductsellhistory;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIdusersellhistory() {
        return idusersellhistory;
    }

    public void setIdusersellhistory(Integer idusersellhistory) {
        this.idusersellhistory = idusersellhistory;
    }

    public Integer getIdproductsellhistory() {
        return idproductsellhistory;
    }

    public void setIdproductsellhistory(Integer idproductsellhistory) {
        this.idproductsellhistory = idproductsellhistory;
    }

    public SellHistoryEntity() {
    }
}
