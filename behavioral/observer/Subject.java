package com.bridgelabz.behavioral.observer;

public interface Subject {
	
	public void register(Observer O);
	public void unRegister(Observer O);
	public void notifyObserver();
	public Object getUpdate(Observer O);
	
}