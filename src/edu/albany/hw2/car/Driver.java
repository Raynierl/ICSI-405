package edu.albany.hw2.car;

public class Driver {
	public static void main(String[] args) {
		FuelGauge fg = new FuelGauge();	
		Odometer om = new Odometer();
		om.setCurrentMiles(999998);
		fg.setGallons(15);
		System.out.println("Current Fuel: " + fg.getGallons() + " gallons\nOdometer: " + om.getCurrentMiles() + " miles");
		om.Drive(fg,20); // AFTER { Gallons: 15 Odometer: 0 }
		System.out.println("Current Fuel: " + fg.getGallons() + " gallons\nOdometer: " + om.getCurrentMiles() + " miles");
		om.Drive(fg,22); // AFTER { Gallons: 14 Odometer: 22 }
		System.out.println("Current Fuel: " + fg.getGallons() + " gallons\nOdometer: " + om.getCurrentMiles() + " miles");	
		fg.refuel(50); // Gallons over 15, stay at 15
		System.out.println("Current Fuel: " + fg.getGallons() + " gallons\nOdometer: " + om.getCurrentMiles() + " miles");	
		
	}
		

}
