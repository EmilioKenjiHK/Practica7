package com.example.Practica7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;


import com.example.Practica7.model.UserTable;
import com.example.Practica7.model.VoteInfoTable;
import com.example.Practica7.model.ResponseTable;
import com.example.Practica7.model.ShopTable;
import com.example.Practica7.model.PurchaseInfoTable;
import com.example.Practica7.model.PurchaseTable;
import com.example.Practica7.service.MyService;

@RestController
@RequestMapping("/api/v1")
public class MyController {

    @Autowired
    private MyService myService;

    // USER
    
    @GetMapping("/user")
    public ResponseEntity<List<UserTable>> getUsers() {

        var elements = myService.getUsers();

        return ResponseEntity.ok().body(elements);
    }

    @PostMapping("/user")
    public void newUser(String name, String surname, LocalDate date) {
        myService.newUser(name, surname, date);
    }
    

    // RESPONSE

    @GetMapping("/response")
    public ResponseEntity<List<ResponseTable>> getResponses() {

        var elements = myService.getResponses();


        return ResponseEntity.ok().body(elements);
    }

    @PutMapping("/response")
    public void update(String response) {
        myService.updateAnswer(response);
    }

    @GetMapping("/response/info")
    public ResponseEntity<List<VoteInfoTable>> getInfoVote(String option) {
        var elements = myService.getInfoVotes(option);

        return ResponseEntity.ok().body(elements);
    }


    // SHOP

    @GetMapping("/shop")
    public ResponseEntity<List<ShopTable>> getShop() {

        var elements = myService.getShop();

        return ResponseEntity.ok().body(elements);
    }

    @DeleteMapping("/shop")
    public void deleteItem(String item) {
        myService.deleteItem(item);
    }

    // PURCHASE

    @GetMapping("/purchase")
    public ResponseEntity<List<PurchaseTable>> getPurchases() {

        var elements = myService.getPurchases();

        return ResponseEntity.ok().body(elements);
    }

    

    @GetMapping("/purchase/info")
    public ResponseEntity<List<PurchaseInfoTable>> getPurchaseInfo(String name, String surname) {
        var elements = myService.getPurchaseInfo(name, surname);

        return ResponseEntity.ok().body(elements);
    }

}
