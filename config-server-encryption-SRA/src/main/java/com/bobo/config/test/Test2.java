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
				, "AQC2XXRmjAgZBuGcwE2mdA7YxkmBad3dul3fIevMEHAC3n5YcYZ2lxka4Z3BKVrbEUFoWqYtbRxdEVJfoMKvKC3vqXzgc3wWj"
				, String.class);
		System.out.println(msg.getBody());

	}

}
