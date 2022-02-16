package com.provide.payment02.controller;

import com.project.pojo.CommonResult;
import com.project.pojo.Payment;
import com.provide.payment02.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:
 * date: 2022-02-09 13:58
 * author: waifaicheung
 * version: 1.0 <br>
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = paymentService.create(dept);
        if(i>0){
            return new CommonResult(200,"插入数据库成功",i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功002",payment);
        }else{
            return new CommonResult(444,"查询失败002",null);
        }
    }

}
