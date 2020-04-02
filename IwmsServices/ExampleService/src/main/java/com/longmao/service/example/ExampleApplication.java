package com.longmao.service.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @Author: wwivan
 * @Date: 2020/4/2日11:14
 * @Description:
 */
@MapperScan(value = "com.longmao.serviceApi.example.mapper")
@EnableCaching
@SpringBootApplication
public class ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
}
