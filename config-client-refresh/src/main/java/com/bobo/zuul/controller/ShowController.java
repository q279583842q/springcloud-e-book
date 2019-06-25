package com.bobo.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope //刷新作用域
public class ShowController {
	
	@Value("${e-book}")
	private String msg;
	
	@RequestMapping("/showMsg")
	public String showMsg(){
		return msg;
	}
	
	/**
	 * 通过RestTemplate发送post请求来刷新
	 * @param args
	 */
	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:9051/refresh";
		template.postForLocation(url, null);
		System.out.println("----");
	}

}
