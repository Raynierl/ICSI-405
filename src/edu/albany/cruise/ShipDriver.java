package edu.albany.cruise; 

import edu.albany.cargo.CargoShip;

public class ShipDriver {
	public static void main(String[] args) {
		
	
		Ship[] allShips = new Ship[9];
		
		Ship s1 = new Ship("The Original","1666");
		Ship s2 = new CruiseShip("Island Cruise","1820", 10000);
		Ship s3 = new CargoShip("CA004B","1820", 2);
		Ship s4 = new Ship("Verns","2002");
		Ship s5 = new CruiseShip("Adebesi Cruiseline","1996", 300);
		Ship s6 = new CargoShip("Rover","1922", 1);
		Ship s7 = new Ship("Mcmanus","1666");
		Ship s8 = new CruiseShip("Emerald City","1999", 500);
		Ship s9 = new CargoShip("Tanker","1979", 3);
		
		allShips[0] = s1;
		allShips[1] = s2;
		allShips[2] = s3;
		allShips[3] = s4;
		allShips[4] = s5;
		allShips[5] = s6;
		allShips[6] = s7;
		allShips[7] = s8;
		allShips[8] = s9;
		
		for ( Ship s : allShips) 
		System.out.println(s);	
		
		
	}
}
