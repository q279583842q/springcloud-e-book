package com.bobo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ConfigClientStart {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientStart.class, args);
	}
}
