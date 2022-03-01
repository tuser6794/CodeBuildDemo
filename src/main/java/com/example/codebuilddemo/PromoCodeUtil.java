package com.example.codebuilddemo;

import java.util.HashMap;

public class PromoCodeUtil {
	
	HashMap<String, Double> promoCodes = new HashMap<String, Double>();
	
	public PromoCodeUtil() {
		promoCodes.put("BINGO", 0.20);
		promoCodes.put("JUMBO", 0.35);
		promoCodes.put("NEW10", 0.10);
		promoCodes.put("HAPPY50", 0.50);
		promoCodes.put("DEAL40", 0.40);
	}
	
	public double applyPromoCode(String promoCode, double amount) {
		double amountToPay = amount - promoCodes.get(promoCode) * amount;
		return amountToPay;
	}
	
	public double getDiscountPercentage(String promoCode) {
		return promoCodes.get(promoCode);
	}

}
