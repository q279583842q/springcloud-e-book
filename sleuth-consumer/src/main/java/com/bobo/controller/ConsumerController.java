package com.bobo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.Product;
import com.bobo.service.ConsumerProductService;

/**
 * 创建订单
 * 
 * @author dengp
 *
 */
@RestController
public class ConsumerController {


	@Autowired
	private ConsumerProductService productService;


	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Product> createOrder() {
		// 查询所有商品
		List<Product> products = this.productService.findAll();
		return products;
	}

	
}
