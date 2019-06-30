package com.bobo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * provider的启动类
 * @author dengp
 *
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.bobo.mapper")
public class StartProduct {

    public static void main(String[] args) {
        SpringApplication.run(StartProduct.class, args);
    }
}
