package com.bridgelabz.builtinannotation;
/*
 * Created by:Shweta Kale.
 * Purpose:Annotation demo.
 * Description:override the student class method in teacher class. 
 * 
 */
public class Teacher extends Student 
{
	int employeeId;
	String employeeName;
	String specialization;
	public Teacher(int employeeId,String employeeName,String specialization)//parameterized constructor.
	{
		super();
	    this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.specialization=specialization;

	}
	@Override//this annotation is used for instructing compiler 
	//that the annotated method is overriding the method.
	public void studentDetails() {
		
		super.studentDetails();
	}
	
	public void teacherDetails()
	{
		System.out.println("employee id:"+employeeId);
		System.out.println("employee name:"+employeeName);
		System.out.println("specialization subject:"+specialization);
	}
}