package com.bridgelabz.builtinannotation;
import java.util.*;
/*
 * Created by:Shweta Kale.
 * Purpose:Annotation demo.
 * Description:student class can have properties and methods. 
 * 
 */
@SuppressWarnings("unused")//this annotation type allows Java programmers to disable 
//compilation warnings for a certain part of a program.
public class Student {

	
	int studentId;
	String studentName;
	String studentAddress;
	
	public Student()//default constructor
	{
		
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void studentDetails()
	{
		System.out.println("student Id:"+studentId);
		System.out.println("student name:"+studentName);
		System.out.println("student address:"+studentAddress);
	}
	
	
	}


