package com.shadow.provider.service.impl;

import com.shadow.provider.dao.PaymentMapper;
import com.shadow.api.entities.Payment;
import com.shadow.provider.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther shadow
 * @create 2020-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements IPaymentService
{
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment)
    {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentMapper.getPaymentById(id);
    }
}
