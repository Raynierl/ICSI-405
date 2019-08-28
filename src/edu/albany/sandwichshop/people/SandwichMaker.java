package edu.albany.sandwichshop.people;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
import edu.albany.sandwichshop.menu.RoastBeefSandwich;
import edu.albany.sandwichshop.menu.Sandwich;
import edu.albany.sandwichshop.menu.*;

public class SandwichMaker {
	private String name;
	
	public SandwichMaker(String name) { this.name = name; }
	public String getName() { return this.name; }
	
	public Sandwich makeSandwich(Sandwich s) {
		System.out.println(name + " started making a " + s.getName() + " sandwich");
		Sandwich sandwich = null;
		switch(s.getName()) {
		case "Prag": sandwich = new RoastBeefSandwich(); break;
		case "BLT": sandwich = new BLT(); break;
		case "ChickenSalad": sandwich = new ChickenSalad(); break;
		}
		
		return sandwich;
		
	}


}
