package com.project.controller;

import com.project.pojo.CommonResult;
import com.project.pojo.Payment;
import com.project.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    //注入服务发现的注解
    @Autowired
    private DiscoveryClient discoveryClient;

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
            return new CommonResult(200,"查询成功001",payment);
        }else{
            return new CommonResult(444,"查询失败001",null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String serviceInfo:services) {
            System.out.println("********注册到eureka中的服务中有:"+services);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("MCROSERVICE-PAYMENT");
        for (ServiceInstance s: instances) {
            System.out.println("当前服务的实例有"+s.getServiceId()+"\t"+s.getHost()+"\t"+s.getPort()+"\t"+s.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentTimeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "ok";
    }

}
