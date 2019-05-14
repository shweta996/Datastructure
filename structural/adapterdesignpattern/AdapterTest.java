package com.bridgelabz.structural.adapterdesignpattern;


public class AdapterTest {
	
	// program is for the normal flow of electricity is high and our mobile needs only 
	//3 volt of current for charging so here socket act as a adapter
	public static void main(String[] args) {
		SocketAdapter socket = new SocketAdapterImplementation();
			
		Volt v3 = getVolt(socket, 3);
		Volt v12 = getVolt(socket,12);
		Volt v120 = getVolt(socket,120);
		System.out.println(v3.getVolt());
		System.out.println(v12.getVolt());
		System.out.println(v120.getVolt());
	}

	private static Volt getVolt(SocketAdapter socket, int i) 
	{
		switch (i)
		{
		case 3: return socket.get3Volt();
		case 12: return socket.get12Volt();
		case 120: return socket.get120Volt();
		default: return socket.get120Volt();
		}
	
	}
}