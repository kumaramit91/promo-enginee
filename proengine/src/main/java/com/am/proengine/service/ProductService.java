package com.am.proengine.service;

import java.util.List;

import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;

public interface ProductService {
	double getProductsTotalPrice(final List<CartDetails> cartDetails);
	List<Product> getProducts();

}
