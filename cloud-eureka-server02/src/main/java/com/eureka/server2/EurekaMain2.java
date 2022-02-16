package com.eureka.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description:
 * date: 2022-02-15 20:19
 * author: waifaicheung
 * version: 1.0 <br>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain2 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain2.class,args);
    }
}
