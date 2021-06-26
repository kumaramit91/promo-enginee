package com.am.proengine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.am.proengine.model.ActivePromotion;

@Service
public class ActivePromotionServiceImpl implements ActivePromotionService{

	@Override
	public List<ActivePromotion> getActivePromotions() {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public void updateActivePromotions(ActivePromotion activePromotion) {
		// TODO Auto-generated method stub
		
	//logic to update rules
		
	}

}
