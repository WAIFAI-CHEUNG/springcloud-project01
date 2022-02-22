package com.project.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 * date: 2022-02-22 16:29
 * author: waifaicheung
 * version: 1.0 <br>
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final  String PAYMENT_URL = "http://cloud-providerconsul-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getPayment(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul/",String.class);
    }
}
