package com.bridgelabz.creational.designpattern;

public class EnumMain {

	public static void main(String[] args)
    {
		
		EnumSingleton instance1 = EnumSingleton.Instance;
		
		EnumSingleton instance2 = EnumSingleton.Instance;
		System.out.println(instance1.hashCode()+"  "+instance2.hashCode());

	}

}
