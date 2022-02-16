package com.provide.payment02.service;

import com.project.pojo.Payment;
import com.provide.payment02.dao.PaymentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * date: 2022-02-09 11:54
 * author: waifaicheung
 * version: 1.0 <br>
 */
@Service
public class PaymentImpl implements PaymentService{

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
