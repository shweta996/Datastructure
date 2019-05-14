package com.bridgelabz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


@SuppressWarnings("unused")
public class DeleteDemo {
	
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
		stmt=con.prepareStatement("delete from studentinfo where studentid=?");
		System.out.println("Enter Id: ");
		int studentid=scanner.nextInt();
		stmt.setInt(1,studentid);
		int number=stmt.executeUpdate();
		System.out.println(number +"  record deleted");
		
    }
	catch (Exception e) {
		System.out.println(e);
	}
}
}