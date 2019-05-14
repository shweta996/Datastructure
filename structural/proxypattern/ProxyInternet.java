package com.bridgelabz.structural.proxypattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
		private Internet internet = new RealInternet(); 
	    private static List<String> bannedSites; 
	      
	    static
	    { 
	        bannedSites = new ArrayList<String>(); 
	        bannedSites.add("abc.com"); 
	        bannedSites.add("def.com"); 
	        bannedSites.add("ijk.com"); 
	        bannedSites.add("lnm.com"); 
	    } 
	      
	@Override
	public void connectTo(String serverHost) throws Exception{
		 if(bannedSites.contains(serverHost.toLowerCase())) 
	        { 
	            try {
					throw new Exception("Access Denied");
				} catch (Exception e) {
						System.out.println(e);
				} 
	        } 
	          
	        internet.connectTo(serverHost); 
	}

}