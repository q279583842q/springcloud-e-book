package com.bobo.config.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test2 {

	/**
	 * 通过RestTemplate来解密
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://127.0.0.1:9060/decrypt";
		RestTemplate template = new RestTemplate();
		ResponseEntity<String> msg = template.postForEntity(url
				, "d901fa3734c5828be5b48ecfd152c170cab17d1729edab56497d1f1db0f8fb9b"
				, String.class);
		System.out.println(msg.getBody());

	}

}
