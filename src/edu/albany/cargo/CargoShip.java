package edu.albany.cargo;

import edu.albany.cruise.Ship;

public class CargoShip extends Ship{
	private int capacity;
	
	public CargoShip(String name, String year, int c) {
		super(name,year);
		this.capacity = c;
		
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return("Name: "+ super.getName() +"\nTonnage: "+ this.getCapacity() + "t\n");
	}
}
