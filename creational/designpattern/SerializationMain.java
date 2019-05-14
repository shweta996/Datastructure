package com.bridgelabz.creational.designpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {
		public static void main(String[] args) {
			SerializationSingleton instance1 = SerializationSingleton.instance;
			
			
			try // for making object serializable
			{
				FileOutputStream fileout = new FileOutputStream("/home/user/eclipse-workspace/DesignPattern/textfile.txt");
				ObjectOutputStream out = new ObjectOutputStream(fileout);
				
				out.writeObject(instance1);
				out.close();
				fileout.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(instance1.hashCode());
			
			/****************************Deserialzing****************/
			SerializationSingleton instance2 = null;
			
			try
			{
				FileInputStream filein = new FileInputStream("/home/user/eclipse-workspace/DesignPattern/textfile.txt");
				ObjectInputStream in = new ObjectInputStream(filein);
				
				instance2 = (SerializationSingleton) in.readObject();
				in.close();
				filein.close();
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(instance2.hashCode());
		}		
		
}