package com.bobo.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bobo.pojo.Trade;

@RequestMapping("/trade")
public interface TradeService {
	
	// 查询所有交易信息
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<Trade> findAll();
	
	@RequestMapping(value="/create" ,method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addTrade(@RequestBody Trade trade);

}
