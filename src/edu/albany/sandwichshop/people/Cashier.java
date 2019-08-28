package edu.albany.sandwichshop.people;
import java.util.ArrayList;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import edu.albany.sandwichshop.menu.Sandwich;

public class Cashier {
	private String name;
	private HashMap<Customer,List<Sandwich>>Order = new HashMap<Customer,List<Sandwich>>();
	private ArrayList<Sandwich> custOrder = new ArrayList<Sandwich>();
	
	public Cashier(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	public ArrayList<Sandwich> getCustOrder(){ return custOrder; }
	public void giveInstructions(Customer c) {
		Greet();
//		Present Customer UI
			for( Sandwich s : c.getOrder()) {
		while(CustomerUI() != 1) {
			s.showIngredients();
		}
		System.out.println(this.getName() + " [Cashier] : and for your next order?");
			}
			takeOrder(c);
	}
	
	public void takeOrder(Customer c) {
		System.out.println(c.getName() + " [Customer] : I would like to Place an order.");
		System.out.println(this.name + "[Cashier]: What would you like to order?");
		System.out.println(c.getName() + "[Customer] : gives order to cashier " + this.name);
		double total = 0;
		for( Sandwich s : c.getOrder() ) {
		
			System.out.println(c.getName() + " : A " + s.getName() );
			total += s.getPrice();
		}
		Random r = new Random();
		if ( (r.nextInt( (10-0)+ 1)) == 0) {
		System.out.println(c.getName() + ": please. =^) ");
		System.out.println(this.name + ": (^=]");
		}
		System.out.println("That will be $" + total + " dollars please.");
		if( (c.getWallet() - total ) < 0) 
		System.out.println("$"+c.getWallet() + " is not enough money im sorry.");
		else
		this.Order.put(c,c.getOrder());
		
	}
	
	public List<Sandwich> sendOrder(Customer c){
		return this.Order.get(c);
	}
	public void serveCustomer(ArrayList<Sandwich> custOrder, Customer c) {
		
		if( custOrder.size() == Order.get(c).size() ) {
			System.out.println(this.name + "[Cashier] : " + c.getName() + " your order is ready!");
			c.receiveOrder(custOrder);
		}
		else
			System.out.println(custOrder.size() + "sdsdsadasdasd    " + Order.get(c).size() + "<-= hashOrder ");
	}
	public void Greet() { custOrder.clear(); System.out.println("Howdy! Welcome to the Emerald City Sandwhich Shop my name is " + name + "! How can I help ya partna!");}
	public void GoodBye() { System.out.println("Thanks for coming to Em City, come back soon!"); }
	
	// Private methods
	private int CustomerUI() {
		int choice = 0;
	
		while(choice != 1 && choice != 2) {
		System.out.println("|||||||||||||||[  Emerald City Menu ]|||||||||||||||||||||");	
		System.out.println(" 1: Place order\n 2: Show Ingredients");
		System.out.println("||||||||||||||||||||||||||||||||||||\n");	
		System.out.println("Please input a valid choice on your keyboard now please.");
		System.out.print(" Enter your choice  ");
		
		choice = new Scanner(System.in).nextInt();
		if(choice != 1 && choice != 2)
			System.out.println(this.name + " : Im Sorry can you repeat that!");
			
		}
		
		return choice;
		
	}
	
	
}
