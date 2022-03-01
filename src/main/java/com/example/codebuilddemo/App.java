package com.example.codebuilddemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to CodeBuild Demo" );
        
        PromoCodeUtil util = new PromoCodeUtil();
        System.out.println("Amount to Pay is: "+util.applyPromoCode("HAPPY50", 2500));
        System.out.println("Discount we will get is: "+util.getDiscountPercentage("BINGO"));
    }
}
