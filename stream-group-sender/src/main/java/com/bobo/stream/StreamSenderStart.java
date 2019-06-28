package com.bobo.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import com.bobo.stream.sender.ISendeService;

@SpringBootApplication
@EnableEurekaClient
// 绑定我们刚刚创建的发送消息的接口类型
@EnableBinding(value={ISendeService.class})
public class StreamSenderStart {

	public static void main(String[] args) {
		SpringApplication.run(StreamSenderStart.class, args);
	}
}
