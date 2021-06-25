package com.am.proengine.model;

import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class ActivePromotion {
	
	private final List<CartDetails> carts;
	private final double price;
	
	public ActivePromotion(final List<CartDetails> carts,final double price) {
		if(carts.isEmpty()) {
			this.carts=Collections.EMPTY_LIST;
		}else {
			this.carts= carts;
		}
		this.price = price;
	}
	

}
