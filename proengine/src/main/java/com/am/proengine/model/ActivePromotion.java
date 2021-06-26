package com.am.proengine.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ActivePromotion {
	
	private final List<CartDetails> carts;
	private final double price;
	
	

}
