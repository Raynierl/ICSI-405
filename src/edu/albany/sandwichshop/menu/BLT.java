package edu.albany.sandwichshop.menu;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
public class BLT extends Sandwich{
	
	private String ingredients[] = {"Bacon", "Lettuce", "Tomato", "Mayonaise","Everything Bagel" };
	
	public BLT() {
		super("BLT", 1.99);
	}

	@Override
	public void showIngredients() {
		System.out.println(" A " + this.getName() + " contains: ");
		// TODO Auto-generated method stub
		for( String i : ingredients)
		System.out.print(i + " ");	
		System.out.println();
	}
	
	
}
