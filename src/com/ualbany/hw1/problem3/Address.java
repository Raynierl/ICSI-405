package com.ualbany.hw1.problem3;
//Raynier Leroux, Assignment 1
public class Address {
		private String line1;
		private String line2;
		private String city;
		private String state;
		private String zip;
		
		public Address(String l1, String l2, String c,String s, String z) {
			line1= l1; line2 = l2; city = c; zip = z;
		}

		public String getLine1() {
			return line1;
		}

		public void setLine1(String line1) {
			this.line1 = line1;
		}

		public String getLine2() {
			return line2;
		}

		public void setLine2(String line2) {
			this.line2 = line2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}
		
}
