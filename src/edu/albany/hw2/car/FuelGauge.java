package edu.albany.hw2.car;

public class FuelGauge {
	
	private int gallons;
	

	public void refuel(int gas) {
		if( (gallons + gas) < 15)
		gallons += gas;
		else
		gallons = 15;
	}
	public int getGallons() {
		return gallons;
	}
	public void setGallons(int gallons) {
		this.gallons = gallons;
	}

}
