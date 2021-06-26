package com.am.proengine.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CartDetails {
	
	private final String skuId;
	private final int count;
	


}
