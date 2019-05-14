package com.bridgelabz.behavioral.observer;

public class ObserverMain {

	public static void main(String[] args) {
			MyTopic topic = new MyTopic();
			Observer obj1 = new MyTopicsubscriber("obj1");
			Observer obj2 = new MyTopicsubscriber("obj2");
			Observer obj3 = new MyTopicsubscriber("obj3");
			
			topic.register(obj1);
			topic.register(obj2);
			topic.register(obj3);
			
			obj1.setSubject(topic);
			obj2.setSubject(topic);
			obj3.setSubject(topic);
			
			obj1.update();
			
			topic.postMessage("new msg");
	}
}