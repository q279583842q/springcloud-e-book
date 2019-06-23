package com.bobo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * User的启动类
 * @author dengp
 *
 */
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.bobo.mapper")
public class StartTrade {

    public static void main(String[] args) {
        SpringApplication.run(StartTrade.class, args);
    }
}
