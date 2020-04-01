package com.longmao.gateway.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日9:50
 * @Description: 微服务gateWay
 */
@SpringBootApplication
@EnableEurekaClient
@CrossOrigin
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
