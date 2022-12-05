package com.shadow.provider.dao;

import com.shadow.api.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentMapper
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
