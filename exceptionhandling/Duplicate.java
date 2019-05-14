package com.bridgelabz.exceptionhandling;

@SuppressWarnings("unused")
/*
 * Created by:Shweta Kale.
 * Purpose:Exception handling demo.
 * Description:Removes duplicate array elements from array. 
 * 
 */

public class Duplicate {
        
	public static void main(String[] args) {
		 try
		 {
		int arr[][]= {{1,1,2,2,3,4,5},
				{1,1,1,1,1,1,1},
				{1,2,3,4,5,6,7},
				{1,2,1,1,1,1,1}};
		int temp=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(arr[i][j]==arr[i][j+1])
				{
					arr[i][j]=0;
					arr[i][j+1]=0;
				}
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(arr[i][j]!=0)
				{
				System.out.print("[ "+arr[i][j]+ " ]");
				}
			}
		   System.out.println("");
	    }
		 }
		catch(Exception ex)
		{
			//System.out.println("Array index out of bound Exception:"+ex);
		     ex.printStackTrace();//it will gives us proper error message and line number
		}
		 
		
		 finally
		 {
			 System.out.println("handle the exception..!!!");
		 }

  }
}
