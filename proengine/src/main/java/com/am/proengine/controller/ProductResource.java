package com.am.proengine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	
	@GetMapping("/")
	public List<Product> getProducts(){
		return new ArrayList<>();
		
	}
	
	@PostMapping("/totalPrice")
	public double getProductsTotalPrice(@RequestBody final List<CartDetails> cartDetails){
		return 0;
		
	}

}
