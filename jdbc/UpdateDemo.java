package com.bridgelabz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


@SuppressWarnings("unused")
public class UpdateDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet result=null;
		Scanner scanner=new Scanner(System.in);
	try 
    {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","new-password");
		System.out.println("connection done");
		stmt=con.prepareStatement("update studentinfo set name='shweta' where studentid=1");
     
		
		int number=stmt.executeUpdate();
		//System.out.println(number);
		System.out.println(number +"record updated..!!");
		
    }
	catch (Exception e) 
	{
		System.out.println(e);
	}
		
	}

}
