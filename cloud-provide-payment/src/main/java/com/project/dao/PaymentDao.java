package com.project.dao;

import com.project.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * description:
 * date: 2022-02-08 17:48
 * author: waifaicheung
 * version: 1.0 <br>
 */
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
