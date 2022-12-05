package com.shadow.springcloud.dao;

import com.shadow.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentDao
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
