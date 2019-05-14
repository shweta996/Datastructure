package com.bridgelabz.dependancyinjection;

public class Employee {
		Service service;
		
		public Employee(Service service)
		{
			this.service = service;
		}
		public String visitEmployee()
		{
			System.out.println(service.getName());
			return service.getName();
		}
	}
