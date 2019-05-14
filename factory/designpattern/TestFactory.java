package com.bridgelabz.factory.designpattern;

public class TestFactory 
{
public static void main(String[] args) {
		
		Computer Pc = ComputerFactory.getInstance("PC", "2.5 GHZ", "1TB", "4 GB");
		System.out.println(Pc);
		Computer Server = ComputerFactory.getInstance("Server", "2.5 GHZ", "2 TB", "8 GB");
		System.out.println(Server);
	}
}
