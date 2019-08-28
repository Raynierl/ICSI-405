package edu.albany.sandwichshop.menu;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
public class RoastBeefSandwich extends Sandwich{

		private String ingredients[] = { "Roast Beef", "Provolone Cheese", "Onion", "Challah Bread" , "Pickles"};
		
		public RoastBeefSandwich() {
			super("Prag", 2.99);
		}
		
		public void showIngredients() {
			System.out.println(" A " + this.getName() + " contains: ");
			for( String i : ingredients)
			System.out.print(i + " ");	
			System.out.println();
		}
}
