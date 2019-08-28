package edu.albany.cruise;

public class CruiseShip extends Ship{
	private int maxPassengers;
	
	public CruiseShip(String name, String year, int mp) {
		super(name,year);
		this.maxPassengers = mp;
	}
	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}


	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}


	@Override
	public String toString() {
		return("Name: "+ super.getName() +"\nMaxPassengers: "+ this.getMaxPassengers() + "\n");
	}

}
