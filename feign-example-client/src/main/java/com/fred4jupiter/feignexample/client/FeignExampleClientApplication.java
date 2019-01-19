package com.fred4jupiter.feignexample.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignExampleClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignExampleClientApplication.class, args);
    }
}

