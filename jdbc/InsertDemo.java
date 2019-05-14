package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet result=null;
		Scanner scanner=new Scanner(System.in);
		
		try 
        {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","new-password");
			System.out.println("connection done");
			stmt=con.prepareStatement("insert into studentinfo values(?,?,?)");
			System.out.println("Enter  id");
			int id=scanner.nextInt();
			System.out.println("Enter name ");
			String name=scanner.next();
			System.out.println("Enter address ");
			String address=scanner.next();
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, address);
			int number=stmt.executeUpdate();
			if(number!=0)
			{
				System.out.println(number +"  record inserted ");
			}
			result=stmt.executeQuery("select * from studentinfo");
			while(result.next())
			{
				System.out.println("studentId :"+result.getInt(1));
				System.out.println("Name :"+result.getString(2));
				System.out.println("address:"+result.getString(3));
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}
}
