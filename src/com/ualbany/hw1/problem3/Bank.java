package com.ualbany.hw1.problem3;
// Raynier Leroux, Assignment 1
public class Bank {
	private String name = "Chase Bank";
	private Address a = new Address("82nd St.", "Floor 2", "Queens", "NY", "11372");
	
	public static void main(String[] args) {
		Person p1 = new Person("Raynier", "Leroux", new Address("86 N.Allen St.", "Floor 1", "Albany", "NY", "12206"));
		Person p2 = new Person("John", "An",new Address("230 manning blvrd.", "Floor 1", "Albany", "NY", "12203") );
		Bank b = new Bank();
		
		System.out.println(p1.getFirstName() + " entered " + b.getName());
		System.out.println(p1.getFirstName() + " opens an Account and puts $1000 dollars in it!\n");
		p1.getCba().setValue(1000.00);
		p2.getCba().setValue(12526.58);
				
		b.Deposit(p1, 500);
		b.Withdraw(p1, 200);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public void Deposit(Person p, double v) {
		System.out.println("                Deposit");
		System.out.println("Name: " + p.getFirstName() + " " + p.getLastName());
		System.out.println("Address: " + p.getAddress().getLine1() + " " + p.getAddress().getLine2() + ", " + p.getAddress().getZip());
		System.out.println("Value Before Deposit: " + p.getCba().getValue());
		p.getCba().setValue(p.getCba().getValue() + v);
		System.out.println("Value: " + p.getCba().getValue());
		System.out.println("---------------------------------------");
		
	}
	public void Withdraw(Person p, double v) {
		System.out.println("                Withdraw");
		System.out.println("Name: " + p.getFirstName() + " " + p.getLastName());
		System.out.println("Address: " + p.getAddress().getLine1() + " " + p.getAddress().getLine2() + ", " + p.getAddress().getZip());
		System.out.println("Value Before Withdraw: " + p.getCba().getValue());
		p.getCba().setValue(p.getCba().getValue() - v);
		System.out.println("Value: " + p.getCba().getValue());
		System.out.println("---------------------------------------");
	}
	
}
