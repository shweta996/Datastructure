package com.bridgelabz.creational.designpattern;
/*
 * Created by:Shweta Kale.
 * Purpose:Singleton Pattern using static block initialization.
 * Description:Instance of class is created in the static block.
 * 
 */

public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;
    
    private StaticBlockInitialization(){}
    
    //static block initialization for exception handling
    static
    {
        try{
            instance = new StaticBlockInitialization();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance()
    {
        return instance;
    }
}
