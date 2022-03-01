package com.example.codebuilddemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
	
	PromoCodeUtil util = new PromoCodeUtil();
   
	@Test
	public void testPromoCode() {
		double expected = 1250.0;
		double actual = util.applyPromoCode("HAPPY50", 2500);
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void testDiscount() {
		double expected = 0.20;
		double actual = util.getDiscountPercentage("BINGO");
		assertEquals(expected, actual, 0.0);
	}
	
}
