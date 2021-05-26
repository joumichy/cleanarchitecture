package com.example.cleanarchi.model.sellhistory;

public interface ISellHistoryRepositry {
    SellHistoryInfo getHistoryInfo(Integer idUser, Integer idProduct);
}
