package com.bobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.mapper.OrdersMapper;
import com.bobo.pojo.Orders;
import com.bobo.pojo.OrdersExample;

@Service
public class OrderServiceImpl {

	@Autowired
	private OrdersMapper ordersMapper;

	public List<Orders> findAll() {
		OrdersExample example = new OrdersExample();
		return ordersMapper.selectByExample(example);
	}

	public Integer addOrder(Orders order) {
		return ordersMapper.insert(order);
	}

	/**
	 * 根据 ID 查询订单
	 */
	public Orders findOrderById(Integer id) {
		return this.ordersMapper.selectByPrimaryKey(id);
	}

	/**
	 * 更新订单
	 */
	public void updateOrder(Orders order) {
		this.ordersMapper.updateByPrimaryKey(order);
	}

}
