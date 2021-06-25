package com.am.proengine.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.am.proengine.model.CartDetails;

@SpringBootTest
public class ProductServiceImplTest {
	ProductService productService;
	@BeforeAll
	void setup() {
		productService = new ProductServiceImpl();
		
	}
	

	@Test
	public void getProductsTotalPrice() {
		
		 List<CartDetails> carts =new ArrayList<>();
		 CartDetails cartDetails = new CartDetails("A",23);
		 carts.add(cartDetails);
		assertTrue(productService.getProductsTotalPrice(carts)>0);
	}

	@Test
	public void getProducts() {
		
		assertNotNull(productService.getProducts().size()>0);
	}

}
