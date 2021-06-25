package com.am.proengine.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.am.proengine.model.ActivePromotion;

@RestController
@RequestMapping("/active/promotions")
public class ActivePromotionResource {
	@GetMapping("/")
	public List<ActivePromotion> getActivePromotions(){
		return new ArrayList<>();
		
	}
	

}
