package com.bobo.config.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test1 {

	/**
	 * 通过RestTemplate来加密数据
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://127.0.0.1:9060/encrypt";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> msg = template.postForEntity(url, "123456", String.class);
		System.out.println(msg.getBody());
	}

}
