package com.bridgelabz.reflection;

/**
 * Created by:Shweta kale.
 * Purpose :Reflection API.
 */

public class Reflection {
	
	private String string;

	public Reflection() {
		string = "Shweta";
	}
	
	//Creation method with no arguments
	
	public void method1()
	{
		System.out.println("method1" +string);
	}
	
	//creating method with argument
	
	public void method2(int n)
	{
		System.out.println("method2"+" " + string + " "+n );
	}
	
	//creating private method
	
	@SuppressWarnings("unused")
	private void method3()
	{
		System.out.println("In private method");
	}	
}