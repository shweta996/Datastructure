package com.bridgelabz.structural.facadedesignpattern;


public class ShopKeeper 
{

	private MobileShop nokia;
	private MobileShop iphone;
	private MobileShop blackberry;
	public ShopKeeper()
	{
		nokia=new Nokia();
		iphone=new Iphone();
		blackberry=new Blackberry();
	}
	public void nokiaSale()
	{
		nokia.mobileNo();
		nokia.mobilePrice();
	}
	public void iphoneSale()
	{
		iphone.mobileNo();
		iphone.mobilePrice();
	}
	public void blackberrySale()
	{
		blackberry.mobileNo();
		blackberry.mobilePrice();
	}
}