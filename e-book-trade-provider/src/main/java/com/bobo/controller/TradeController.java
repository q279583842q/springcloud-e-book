package com.bobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.Orders;
import com.bobo.pojo.Trade;
import com.bobo.service.ProviderOrderService;
import com.bobo.service.TradeService;
import com.bobo.service.TradeServiceImpl;

@RestController
public class TradeController implements TradeService{
	
	@Autowired
	private TradeServiceImpl service;
	
	@Autowired
	private ProviderOrderService providerOrderService;

	@Override
	public List<Trade> findAll() {
		// TODO Auto-generated method stub
		return service.findTradeAll();
	}

	@Override
	public void addTrade(@RequestBody Trade trade) {
		// 添加支付信息
		service.addTrade(trade);
		//根据 ID 查询订单
		Orders order = this.providerOrderService.findOrderById(trade.getOrderId());
		System.out.println(order.getId()+" ----  "+trade.getId());
		order.setTradeId(trade.getId());
		//更新订单
		this.providerOrderService.updateOrder(order);
	}

}
