package com.bobo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.pojo.Product;
import com.bobo.service.ProductService;
import com.bobo.service.ProductServiceImpl;

/**
 * 商品服务  提供者
 * @author dengp
 *
 */
@RestController
public class ProductController implements ProductService{
	
	@Autowired
	private ProductServiceImpl service;

	@Override
	public List<Product> findAll() {
		return service.findAll();
	}

}
