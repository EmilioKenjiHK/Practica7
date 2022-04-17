package com.example.Practica7.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import com.example.Practica7.model.PurchaseTable;
import com.example.Practica7.model.ResponseTable;
import com.example.Practica7.model.ShopTable;
import com.example.Practica7.model.UserTable;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;
    
    // USER

    @Test
    public void given_endpoint_teams_in_user_when_call_then_Ok() {

        //Given
        String address = "http://localhost:" + port + "/api/v1/user";


        //When
        ResponseEntity<List<UserTable>> result =
                restTemplate.exchange(
                        address,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        }
                );

        //Then
        then(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(result.getBody().size()).isEqualTo(1);
    }

    // RESPONSE

    @Test
    public void given_endpoint_teams_in_response_when_call_then_Ok() {

        //Given
        String address = "http://localhost:" + port + "/api/v1/response";


        //When
        ResponseEntity<List<ResponseTable>> result =
                restTemplate.exchange(
                        address,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        }
                );

        //Then
        then(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(result.getBody().size()).isEqualTo(2);
    }

    // SHOP 

    @Test
    public void given_endpoint_teams_in_shop_when_call_then_Ok() {

        //Given
        String address = "http://localhost:" + port + "/api/v1/shop";

        //When
        ResponseEntity<List<ShopTable>> result =
                restTemplate.exchange(
                        address,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        }
                );

        //Then
        then(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(result.getBody().size()).isEqualTo(4);
    }

    // Purchase

    @Test
    public void given_endpoint_teams_in_purchase_when_call_then_Ok() {

        //Given
        String address = "http://localhost:" + port + "/api/v1/purchase";

        //When
        ResponseEntity<List<PurchaseTable>> result =
                restTemplate.exchange(
                        address,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<>() {
                        }
                );

        //Then
        then(result.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(result.getBody().size()).isEqualTo(1);
    }
    
}
