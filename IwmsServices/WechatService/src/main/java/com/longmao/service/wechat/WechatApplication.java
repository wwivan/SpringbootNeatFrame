package com.longmao.service.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: wwivan
 * @Date: 2020/4/1日10:14
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class WechatApplication {
    public static void main(String[] args) {
        SpringApplication.run(WechatApplication.class,args);
    }
}
