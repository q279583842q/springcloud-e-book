package com.bobo.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class StartZuul {

	public static void main(String[] args) {
		SpringApplication.run(StartZuul.class, args);
	}
}
