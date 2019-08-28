package com.ualbany.hw1.problem3;
//Raynier Leroux, Assignment 1
public class Person {
	private String firstName;
	private String lastName;
	private Address address;
	private CheckingBankAccount cba = new CheckingBankAccount();
	
		public Person(String fname, String lname, Address a ) {
			firstName = fname; lastName = lname; address = a;
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

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public CheckingBankAccount getCba() {
			return cba;
		}

		public void setCba(CheckingBankAccount cba) {
			this.cba = cba;
		}
		
}
