package com.bridgelabz.dependancyinjection;
/*
 * Created by:Shweta Kale.
 * Purpose:Dependancy injection demo. 
 */
public class EmployeeMainImpl {

	public static void main(String[] args) {
		
		//creating different objects of service
			Service s1 = new Service("annual_salary");
			Service s2 = new Service("Incentives");
			Service s3 = new Service("tranportation");
			
			
			Employee c1 = new Employee(s1);
			Employee c2 = new Employee(s2);
			Employee c3 = new Employee(s3);
			
			c1.visitEmployee();
			c2.visitEmployee();
			c3.visitEmployee();

	}
}