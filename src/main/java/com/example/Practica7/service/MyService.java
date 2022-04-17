package com.example.Practica7.service;

import java.time.LocalDate;
import java.util.List;

import com.example.Practica7.model.UserTable;
import com.example.Practica7.model.VoteInfoTable;
import com.example.Practica7.model.ResponseTable;
import com.example.Practica7.model.ShopTable;
import com.example.Practica7.model.PurchaseInfoTable;
import com.example.Practica7.model.PurchaseTable;


public interface MyService {
    // USER
    List<UserTable> getUsers(); // Solo para Testing
    void newUser(String name,String surname, LocalDate date);

    // RESPONSE
    List<ResponseTable> getResponses();
    void updateAnswer(String response);
    List<VoteInfoTable>  getInfoVotes(String option);


    // SHOP
    List<ShopTable> getShop();
    boolean deleteItem(String item);

    // PURCHASE
    List <PurchaseTable> getPurchases();
    List <PurchaseInfoTable> getPurchaseInfo(String name, String surname);

}
