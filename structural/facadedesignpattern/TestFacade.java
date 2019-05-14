package com.bridgelabz.structural.facadedesignpattern;

public class TestFacade {
	
	public static void main(String[] args) {
		
		ShopKeeper shop=new ShopKeeper();
		shop.nokiaSale();
		shop.iphoneSale();
		shop.blackberrySale();
	}

}