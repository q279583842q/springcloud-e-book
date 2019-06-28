package com.bobo.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ShowController {
	
	@Value("${e-book}")
	private String msg;
	
	@RequestMapping("/showMsg")
	public String showMsg(){
		return msg;
	}

}
