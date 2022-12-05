package com.shadow.provider.service;

import com.shadow.api.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zzyy
 * @create 2020-02-18 10:40
 */
public interface IPaymentService
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
