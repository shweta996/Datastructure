package com.bridgelabz.creational.designpattern;

public class Reflectionsingleton {
	
	private Reflectionsingleton()
	{
		
	}
	
	public static Reflectionsingleton getInstance()
	{
		return Reflection.instance;
	}
	
	private static class Reflection
	{
		static Reflectionsingleton instance = new Reflectionsingleton();
	}
}