package com.bridgelabz.factory.designpattern;

public class ComputerFactory {
	public static Computer getInstance(String type , String CPU, String HDD , String RAM)
	{
		if("Pc".equalsIgnoreCase(type))
		{
			return new Pc(CPU, RAM,HDD);
		}
		else if("Server".equalsIgnoreCase(type))
		{
			return new Server(HDD,RAM,CPU);
		}
	
		return null;
	}

}
