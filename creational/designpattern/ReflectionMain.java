package com.bridgelabz.creational.designpattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMain {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Reflectionsingleton instance1 = Reflectionsingleton.getInstance(); // for normal instance
        Reflectionsingleton instance2 = null; 
        try  // making reflection so that it destroys the singletone.
        { 
            
			Constructor[] constructors =  
                    Reflectionsingleton.class.getDeclaredConstructors(); 
            for (Constructor constructor : constructors)  
            { 
                // Below code will destroy the singleton pattern 
                constructor.setAccessible(true); 
                instance2 = (Reflectionsingleton) constructor.newInstance(); 
                break; 
            } 
        } 
      
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
          
    System.out.println(instance1.hashCode()); 
    System.out.println(instance2.hashCode()); 
    } 
}