package com.bridgelabz.structural.facadedesignpattern;


public class Iphone implements MobileShop
{

	@Override
	public void mobileNo() 
	{
	System.out.println("Iphone X");
		
	}

	@Override
	public void mobilePrice() 
	{
		
		System.out.println("Price 65000");
		
	}	

}