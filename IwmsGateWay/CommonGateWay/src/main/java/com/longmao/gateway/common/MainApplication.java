package com.longmao.gateway.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:50
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
