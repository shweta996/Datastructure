package com.bridgelabz.prototype.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {

	private List<String> employee;

	public Employee() {
		employee = new ArrayList<String>();// creating the arraylist of employee
	}

	public Employee(List<String> employee) {
		
		this.employee = employee;
	}

	public void loadData()// adding the data into employee
	{
		employee.add("shweta");
		employee.add("mussadik");
		employee.add("kalyani");
	}

	public List<String> getEmployee() {
		return employee;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();

		for (String s : this.getEmployee()) {
			temp.add(s);
		}
		return new Employee(temp);
	}
}
