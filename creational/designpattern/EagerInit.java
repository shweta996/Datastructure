package com.bridgelabz.creational.designpattern;
/*
 * Created by:Shweta Kale.
 * Purpose:Singleton Pattern using eager initialization.
 * Description:The instance of Singleton Class is created 
 * at the time of class loading. 
 * 
 */

public class EagerInit {

	private EagerInit()
	{
		
	}
private static EagerInit instance = new EagerInit();
	
	public static EagerInit getInstance()
	{
		return instance;
	}
}
