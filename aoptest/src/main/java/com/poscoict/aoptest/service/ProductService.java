package com.poscoict.aoptest.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.poscoict.aoptest.vo.ProductVo;

@Component
public class ProductService {

	public ProductVo find(String name) {
		System.out.println("[ProductService] finding..");
		
//		if(1-1==0) throw new RuntimeException("Find Exception");
		return new ProductVo(name);
	}
}
