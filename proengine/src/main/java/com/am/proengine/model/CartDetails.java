package com.am.proengine.model;

import lombok.Data;

@Data
public class CartDetails {
	
	private final String skuId;
	private final int count;
	
public CartDetails(final String skuId, final int count) {
		this.skuId =skuId;
		this.count =count;
	}

}
