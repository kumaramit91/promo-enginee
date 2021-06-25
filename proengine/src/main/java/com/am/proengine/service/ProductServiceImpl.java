package com.am.proengine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public double getProductsTotalPrice(List<CartDetails> cartDetails) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
