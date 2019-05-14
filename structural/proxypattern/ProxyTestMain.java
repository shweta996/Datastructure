package com.bridgelabz.structural.proxypattern;


public class ProxyTestMain {
	public static void main (String[] args) 
    { 
        Internet internet = new ProxyInternet(); 
        try
        { 
            internet.connectTo("facebook.com"); 
            internet.connectTo("ijk.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
}