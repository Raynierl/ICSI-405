package com.ualbany.hw1.problem1;
//Raynier Leroux, Assignment 1
public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String fname, String lname,double salary) {
	firstName = fname; lastName = lname; 
	if(salary <= 0.0)
		this.salary = 0.0;
	else
		this.salary = salary;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
