package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * description:
 * date: 2022-02-22 14:43
 * author: waifaicheung
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMainConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainConsulMain.class,args);
    }
}
