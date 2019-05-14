package com.bridgelabz.creational.designpattern;

public class BillPughSingleton {


	private BillPughSingleton()
	{
		
	}
	
	public static BillPughSingleton getInstance()
	{
		return billBugher.instance;
	}
	
	private static class billBugher
	{
		 static BillPughSingleton instance = new BillPughSingleton();
	}
}