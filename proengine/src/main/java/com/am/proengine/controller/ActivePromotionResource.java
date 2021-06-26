package com.am.proengine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.am.proengine.model.ActivePromotion;
import com.am.proengine.service.ActivePromotionService;
import com.am.proengine.service.ProductService;


@RestController
@RequestMapping("/active/promotions")
public class ActivePromotionResource {
	
	private ActivePromotionService activePromotionService;
	@Autowired
	public ActivePromotionResource( ActivePromotionService activePromotionService) {
		this.activePromotionService =activePromotionService;
	}
	
	@GetMapping("/")
	public List<ActivePromotion> getActivePromotions(){
	//returning empty list: here we can call service to fetch active rules available
		
		return activePromotionService.getActivePromotions();
		
	}
	
	@PostMapping("/")
	
	public void updateActivePromotions(@RequestBody ActivePromotion activePromotion){
	//updating active promotion
		activePromotionService.updateActivePromotions(activePromotion);
		
		
	}
	

}
