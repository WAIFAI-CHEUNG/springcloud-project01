package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description:
 * date: 2022-02-23 14:38
 * author: waifaicheung
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignMain.class,args);
    }
}
