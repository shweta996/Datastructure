package com.bridgelabz.structural.proxypattern;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverHost) {
	
        System.out.println("Connecting to "+ serverHost); 
	}

	
}