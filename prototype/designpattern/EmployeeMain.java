package com.bridgelabz.prototype.designpattern;
import java.util.List;

public class EmployeeMain {
public static void main(String[] args) throws CloneNotSupportedException {
	
	Employee employee = new Employee();// original object
	
	employee.loadData();
	
	Employee emp1 = (Employee) employee.clone();//duplicate object
	Employee emp2 = (Employee) employee.clone();//duplicate object
	
	List<String> listEmp1 = emp1.getEmployee();// modifying object
	listEmp1.add("anil");
	
	List<String> listEmp2 = emp2.getEmployee();
	listEmp2.remove("shweta");
	//System.out.println(employee);
	System.out.println("1st object"+listEmp1);
	System.out.println("2nd object"+listEmp2);
}
}