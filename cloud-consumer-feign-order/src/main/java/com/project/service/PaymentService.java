package com.project.service;

import com.project.pojo.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * description:
 * date: 2022-02-23 14:51
 * author: waifaicheung
 * version: 1.0 <br>
 */
@ComponentScan
//使用feign，指定调用哪个微服务
@FeignClient(value ="mcroservice-payment")
public interface PaymentService {

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentTimeOut() throws InterruptedException;
}
