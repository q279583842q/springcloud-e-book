package com.bobo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.mapper.ProductMapper;
import com.bobo.pojo.Product;
import com.bobo.pojo.ProductExample;

@Service
public class ProductServiceImpl {
	
	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> findAll(){
		ProductExample example = new ProductExample();
		return productMapper.selectByExample(example);
	}

}
