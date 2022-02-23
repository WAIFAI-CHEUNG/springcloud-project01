package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * description:
 * date: 2022-02-23 11:46
 * author: waifaicheung
 * version: 1.0 <br>
 */
@Configurable
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
