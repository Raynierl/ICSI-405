package com.ualbany.hw1.problem1;
//Raynier Leroux, Assignment 1
public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raynier", "Leroux", -14.5);
		Employee e2 = new Employee("John", "An",458.68);
		System.out.println("Eployee " + e1.getFirstName() + " Salary: $" + e1.getSalary());
		System.out.println("Eployee " + e2.getFirstName() + " Salary: $" + e2.getSalary());
		System.out.println("Lest Give a 10% Raise and Start Raynier off at $100.0!");
		e1.setSalary(100.0);
		e1.setSalary(e1.getSalary() + (e1.getSalary() * 0.10));
		e2.setSalary(e2.getSalary() + (e2.getSalary() * 0.10));
		
		System.out.println("Eployee " + e1.getFirstName() + " Salary: $" + e1.getSalary());
		System.out.println("Eployee " + e2.getFirstName() + " Salary: $" + e2.getSalary());
	}
}
