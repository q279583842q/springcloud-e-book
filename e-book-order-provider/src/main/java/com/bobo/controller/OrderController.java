package com.bobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.Orders;
import com.bobo.service.OrderService;
import com.bobo.service.OrderServiceImpl;

/**
 * 订单服务  提供者
 * @author dengp
 *
 */
@RestController
public class OrderController implements OrderService{
	
	@Autowired
	private OrderServiceImpl service;

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}

	@Override
	public Integer addOrder(@RequestBody Orders order) {
		// TODO Auto-generated method stub
		service.addOrder(order);
		return  order.getId();
	}
	
	@Override
	public Orders findOrderById(Integer orderid) {
		return this.service.findOrderById(orderid);
	}
	@Override
	public void updateOrder(@RequestBody Orders order) {
		this.service.updateOrder(order);
	}
}
