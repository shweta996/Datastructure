package com.bridgelabz.creational.designpattern;

public class SingletonMain {
	public static void main(String args[])
	{
System.out.println("*******EAGER INITIALIZATION*******");
		
		EagerInit instance = EagerInit.getInstance();
		System.out.println(instance.hashCode());
		
		EagerInit instance1 = EagerInit.getInstance();
		System.out.println(instance1.hashCode());
		
		System.out.println("*******LAZY INITIALIZATION*******");
		
		LazyInitialization obj1 = LazyInitialization.getInstance();
		System.out.println(obj1.hashCode());
		
		LazyInitialization obj2 = LazyInitialization.getInstance();
		System.out.println(obj2.hashCode());
		
		System.out.println("********USING STATIC BLOCK**********");
		
		StaticBlockInitialization object = StaticBlockInitialization.getInstance();
		System.out.println(object.hashCode());
		
		StaticBlockInitialization object1 = StaticBlockInitialization.getInstance();
		System.out.println(object1.hashCode());
		
		System.out.println("********USING THREAD SAFE INITIALIZATION**********");
		
		ThreadSafeSingleton Oobject = ThreadSafeSingleton.getInstance();
		System.out.println(Oobject.hashCode());
		
		ThreadSafeSingleton Oobject1 = ThreadSafeSingleton.getInstance();
		System.out.println(Oobject1.hashCode());
		
		System.out.println("********BILL PUGH INITIALIZATION**********");
		
		BillPughSingleton Bobject = BillPughSingleton.getInstance();
		System.out.println(Bobject.hashCode());
		
		BillPughSingleton Bobject1 = BillPughSingleton.getInstance();
		System.out.println(Bobject1.hashCode());
		
	}

}
