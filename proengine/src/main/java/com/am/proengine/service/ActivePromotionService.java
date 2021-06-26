package com.am.proengine.service;

import java.util.List;


import com.am.proengine.model.ActivePromotion;

public interface ActivePromotionService {
	 List<ActivePromotion> getActivePromotions();
	 void updateActivePromotions(ActivePromotion activePromotion);

}
