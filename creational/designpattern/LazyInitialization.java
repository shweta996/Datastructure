package com.bridgelabz.creational.designpattern;
/*
 * Created by:Shweta Kale.
 * Purpose:Singleton Pattern using static block initialization.
 * Description:Creates the instance in the global access method.
 * 
 */

public class LazyInitialization {
		
		private LazyInitialization()
		{
			
		}
		
		private static LazyInitialization instance = null;
		
		public static LazyInitialization getInstance()
		{
			if(instance == null)
			{
				instance = new LazyInitialization();
			}
			
			return instance;
		}
	}

