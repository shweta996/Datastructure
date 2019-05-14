package com.bridgelabz.creational.designpattern;
import java.io.Serializable; 

	@SuppressWarnings("serial")
	public class SerializationSingleton implements Serializable
	{ 
		// Implements serializable means converting object to byte stream
		
		private SerializationSingleton()
		{
			
		}
		
		public static SerializationSingleton instance = new SerializationSingleton();
		
		public static Object readResolve()
		{
			return instance;
			
		}
		

	}

