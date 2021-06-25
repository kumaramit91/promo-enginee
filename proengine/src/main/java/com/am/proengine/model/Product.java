package com.am.proengine.model;

import lombok.Data;

@Data
public class Product {
	
	private  final String skuId;
	private  final double price;
	
	public Product(final String skuId,final double price) {
		this.skuId =skuId;
		this.price = price;
	}
	
}
