package com.am.proengine.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.am.proengine.model.ActivePromotion;
import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	ActivePromotionService activePromotionService;
	@Autowired
	public ProductServiceImpl( ActivePromotionService activePromotionService) {
		this.activePromotionService =activePromotionService;
	}
	
	

	@Override
	public double getProductsTotalPrice(List<CartDetails> cartDetails) {
		
		//We have to fetch active promotion rule here from ActivePromotionServiceImpl Class
	    Map<String, Double> productMap = getProducts().stream().collect(Collectors.toMap(Product::getSkuId,Product::getPrice));
	    Map<String, Integer> cartMap =  cartDetails.stream().collect(Collectors.toMap(CartDetails::getSkuId,CartDetails::getCount));
	    double totalPrice =0.0;
	   if(cartMap.containsKey("A"))
		   totalPrice += (cartMap.get("A") / 3) * 130 + (cartMap.get("A") % 3 * productMap.get("A"));
	   if(cartMap.containsKey("B"))
		   totalPrice += (cartMap.get("B") / 2) * 45 + (cartMap.get("B") % 2 * productMap.get("B"));
	   if(cartMap.containsKey("C")&&!cartMap.containsKey("D"))
		   totalPrice += cartMap.get("C") * productMap.get("C");
	   if(cartMap.containsKey("D")&&!cartMap.containsKey("C"))
		   totalPrice += cartMap.get("D")  * productMap.get("D");
	   if(cartMap.containsKey("C")&&cartMap.containsKey("D")) {
		   int ctrC = cartMap.get("C");
		   int ctrD = cartMap.get("D");
		   if(ctrC==ctrD) {
			   totalPrice += ctrC * 30;
		   }
		   if(ctrC<ctrD) {
			   totalPrice += ctrC * 30+(ctrD-ctrC)* productMap.get("D");
		   }
		   
		   if(ctrC>ctrD) {
			   totalPrice += ctrD * 30+(ctrC-ctrD)* productMap.get("C");
		   }
	   }
		   
	    return totalPrice;

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<>();
		products.add(new Product("A",50));
		products.add(new Product("B",30));
		products.add(new Product("C",20));
		products.add(new Product("D",15));
		
		return products;
	}

}
