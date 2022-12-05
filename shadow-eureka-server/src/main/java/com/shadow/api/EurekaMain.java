package com.shadow.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther shadow
 * @create 2020-02-18 21:15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain
{
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}
