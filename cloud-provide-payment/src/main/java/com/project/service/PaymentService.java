package com.project.service;

import com.project.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * description:
 * date: 2022-02-09 11:24
 * author: waifaicheung
 * version: 1.0 <br>
 */
public interface PaymentService {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
