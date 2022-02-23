package com.project.controller;

import com.project.pojo.CommonResult;
import com.project.pojo.Payment;
import com.project.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * date: 2022-02-23 15:00
 * author: waifaicheung
 * version: 1.0 <br>
 */
@RestController
public class OrderFeignController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        CommonResult result = paymentService.queryById(id);
        return result;
    }

    @GetMapping("/consumer/payment/paymentTimeOut")
    public String paymentTimeOut() throws InterruptedException {
        String s = paymentService.paymentTimeOut();
        return s;
    }

}
