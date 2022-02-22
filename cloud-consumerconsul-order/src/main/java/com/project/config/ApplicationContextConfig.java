package com.project.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 * date: 2022-02-22 16:31
 * author: waifaicheung
 * version: 1.0 <br>
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //RestTemplate 的负载均衡能力
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
