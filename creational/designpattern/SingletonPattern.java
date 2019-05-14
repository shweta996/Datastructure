package com.bridgelabz.creational.designpattern;
/*
 * Created by:Shweta Kale.
 * Purpose:Singleton Pattern.
 * Description:Creating only one instance of a class.
 * 
 */
class Test
{
	static Test test=new Test();
	private Test()
	{
		
	}
	public static Test getInstance()
	{
		return test;
	}
	
}

public class SingletonPattern {
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Test test1=Test.getInstance();
		
	}

}
