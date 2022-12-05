package com.shadow.consumer.controller;

import com.shadow.api.entities.CommonResult;
import com.shadow.api.entities.Payment;
import com.shadow.consumer.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther shadow
 * @create 2020-02-20 0:05
 */
@RestController
@Slf4j
public class OrderController
{
    @Autowired
    private FeignService feignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return feignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout()
    {
        // OpenFeign客户端一般默认等待1秒钟
        return feignService.paymentFeignTimeout();
    }
}
