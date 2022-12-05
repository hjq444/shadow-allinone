package com.shadow.consumer.service;

import com.shadow.api.entities.CommonResult;
import com.shadow.api.entities.Payment;
import com.shadow.provider.model.param.announcement.AnnouncementUpdateF;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @auther shadow
 * @create 2020-02-19 23:59
 */
@FeignClient(value = "SHADOW-PROVIDER-SERVICE")
public interface FeignService
{
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();

    @PostMapping("/announcement/saveOrUpdate")
    public Boolean saveOrUpdate(AnnouncementUpdateF updateF);
}
