package com.bobo.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ShowController {
	
	@Value("${e-book}")
	private String msg;
	
	@RequestMapping("/showMsg")
	public String showMsg(){
		return msg;
	}
	
	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:9050/bus/refresh";
		template.postForLocation(url, null);
		System.out.println("刷新客户端...");
	}

}
