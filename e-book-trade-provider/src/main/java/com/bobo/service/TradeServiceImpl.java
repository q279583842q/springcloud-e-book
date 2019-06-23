package com.bobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.mapper.TradeMapper;
import com.bobo.pojo.Trade;
import com.bobo.pojo.TradeExample;

@Service
public class TradeServiceImpl {

	@Autowired
	private TradeMapper tradeMapper;

	/**
	 * 查询所有交易信息
	 */
	public List<Trade> findTradeAll() {
		TradeExample example = new TradeExample();
		return this.tradeMapper.selectByExample(example);
	}

	/**
	 * 添加交易信息
	 */
	public void addTrade(Trade trade) {
		this.tradeMapper.insert(trade);
	}
}
