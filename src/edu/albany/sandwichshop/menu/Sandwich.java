package edu.albany.sandwichshop.menu;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
public abstract class Sandwich {
	private double price;
	private String name;
	
	//         Abstract method
	public abstract void showIngredients();
	
	public Sandwich(String name, double price) {
		this.name = name; this.price = price;
	}
	public double getPrice() { return price; }
	public String getName() { return name; }
	
	@Override
	public String toString() {
		return ("Name: "+ name + "\nPrice: $" + price );
	}
}
