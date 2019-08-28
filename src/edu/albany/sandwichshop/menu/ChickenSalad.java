package edu.albany.sandwichshop.menu;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
public class ChickenSalad extends Sandwich{
	
	private String ingredients[] = {"Shredded Chicken Breast", "Mayonaise", "Onions", "Celerey", "Craisins"};
	
	public ChickenSalad() {
		super("Chicken Salad", 4.99);
		
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
