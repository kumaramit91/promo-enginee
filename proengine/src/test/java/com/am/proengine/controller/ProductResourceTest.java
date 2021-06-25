package com.am.proengine.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;
import com.am.proengine.service.ProductService;

@SpringBootTest
public class ProductResourceTest {
	@Mock ProductService productService;
	ProductResource productResource;
	@BeforeAll
	void setup() {
		productResource = new ProductResource(productService);
		
	}
	

	@Test
	public void getProductsTotalPrice() {
		Mockito.when(productService.getProductsTotalPrice(Mockito.any())).thenReturn(100.0);
		
		List<CartDetails> carts =new ArrayList<>();
		 CartDetails cartDetails = new CartDetails("A",23);
		 carts.add(cartDetails);
		assertEquals(productResource.getProductsTotalPrice(carts),100);
	}

	@Test
	public void getProducts() {
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("A",100.0));
		Mockito.when(productService.getProducts()).thenReturn(products);
		assertNotNull(productResource.getProducts().size()>0);
	}

}
