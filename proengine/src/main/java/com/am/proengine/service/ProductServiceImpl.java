package com.am.proengine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.am.proengine.model.CartDetails;
import com.am.proengine.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	

	@Override
	public double getProductsTotalPrice(List<CartDetails> cartDetails) {
		int counterOfA = 0;
	    int priceOfA = 50;
	    int counterOfB = 0;
	    int priceOfB = 30;
	    int counterOfC = 0;
	    int priceOfC = 20;
	    int counterOfD = 0;
	    int priceOfD = 15;

	    for (CartDetails cart:cartDetails)
	    {
	    
	    	switch(cart.getSkuId()) {
	    	case "A":
            case "a":
                counterOfA += 1;
                break;
            case "B":
            case "b":
                counterOfB += 1;
                break;
            case "C":
            case "c":
                counterOfC += 1;
                break;
            case "D":
            case "d":
                counterOfD += 1;
                break;
	    	}
	    	}
	    double totalPriceOfA = (counterOfA / 3) * 130 + (counterOfA % 3 * priceOfA);
	    double totalPriceOfB = (counterOfB / 2) * 45 + (counterOfB % 2 * priceOfB);
	    double totalPriceOfC = (counterOfC * priceOfC);
	    double totalPriceOfD = (counterOfD * priceOfD);
	    return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;

	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
