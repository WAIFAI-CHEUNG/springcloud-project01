package com.provide.payment02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:
 * date: 2022-02-08 17:45
 * author: waifaicheung
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain02 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain02.class,args);
    }
}
