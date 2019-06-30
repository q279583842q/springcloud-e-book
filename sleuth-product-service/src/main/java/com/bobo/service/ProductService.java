package com.bobo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bobo.pojo.Product;

@RequestMapping("/product")
public interface ProductService {

	@RequestMapping(value="findAll",method=RequestMethod.GET)
	public List<Product> findAll();
}
