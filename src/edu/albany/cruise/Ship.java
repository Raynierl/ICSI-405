package edu.albany.cruise;

public class Ship {
	private String name,year;
	
	public Ship(String name,String year) {
		this.name = name; this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return("ShipName: " + name + "\nYear Built: " + year + "\n");
				
	}
}
