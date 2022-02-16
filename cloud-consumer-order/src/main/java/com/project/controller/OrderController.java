package com.project.controller;

import com.project.pojo.CommonResult;
import com.project.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description:
 * date: 2022-02-14 16:28
 * author: waifaicheung
 * version: 1.0 <br>
 */
@RestController
public class OrderController {
    //调用支付订单服务端的ip+端口号
    public static final  String PAYMENT_URL = "http://mcroservice-payment";

    @Autowired
    private RestTemplate restTemplate;

    //创建支付订单的接口
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
