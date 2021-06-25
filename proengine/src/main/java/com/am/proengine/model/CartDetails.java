package com.am.proengine.model;

public class CartDetails {
	
	private final String skuId;
	private final int count;
	
public CartDetails(final String skuId, final int count) {
		this.skuId =skuId;
		this.count =count;
	}

public String getSkuId() {
	return skuId;
}

public int getCount() {
	return count;
}



}
