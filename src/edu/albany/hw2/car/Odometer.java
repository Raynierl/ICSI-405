package edu.albany.hw2.car;

public class Odometer {
	
	private int currentMiles;
	
	public int getCurrentMiles() {
		return currentMiles;
	}
	public void setCurrentMiles(int currentMiles) {
		this.currentMiles = currentMiles;
	}
	public void Drive(FuelGauge fuel, int miles) {
		this.currentMiles += miles;
		if(this.currentMiles > 999999) {
			this.currentMiles = 0;
		}
		int burned = miles/22;
		fuel.setGallons(fuel.getGallons() - burned);
	}
	
}

