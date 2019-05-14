package com.bridgelabz.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers = new ArrayList<>();
	String message;
	boolean Changed;
	//private final Object MUTEX = new  Object();
	
	@Override
	public void register(Observer O) {
		
		if(O == null)
		{
			System.out.println("observer empty");
		}
		if(!observers.contains(O))
		{
			observers.add(O);
		}
	}

	@Override
	public void unRegister(Observer O) {
			
		observers.remove(O);
	}

	@Override
	public void notifyObserver() {
	
		List<Observer> observerLocal = null;
		
		if(!Changed)
		{
			return;
		}
		observerLocal = new ArrayList<Observer>();
		this.Changed = false;
		
		for(Observer observerL : observerLocal)
		{
			observerL.update();
		}
	}

	@Override
	public Object getUpdate(Observer O) {

		return this.message;
	}
	
	public void postMessage(String msg)
	{
		System.out.println("message posted:"+msg);
		this.message = msg;
		this.Changed = true;
		
		notifyObserver();
	}

}