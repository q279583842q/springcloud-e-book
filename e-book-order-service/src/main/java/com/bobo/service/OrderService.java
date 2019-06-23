package com.bobo.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bobo.pojo.Orders;

@RequestMapping("/order")
public interface OrderService {
	
	@GetMapping("/findAll")
	public List<Orders> findAll();
	
	@PostMapping(value="/addOrder",consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer addOrder(@RequestBody Orders order);
	
	//根据订单 ID 查询订单
	@RequestMapping(value="/findOrderById",method=RequestMethod.GET)
	public Orders findOrderById(@RequestParam("orderid") Integer orderid);
	
	//更新订单
	@RequestMapping(value="/updateOrder",method=RequestMethod.POST
			,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updateOrder(@RequestBody Orders order);

}
