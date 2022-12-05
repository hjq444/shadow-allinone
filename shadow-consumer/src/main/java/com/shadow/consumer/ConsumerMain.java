package com.shadow.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther shadow
 * @create 2020-02-19 23:57
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerMain
{
    public static void main(String[] args) {
            SpringApplication.run(ConsumerMain.class, args);
    }
}
