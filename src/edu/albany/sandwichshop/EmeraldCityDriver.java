package edu.albany.sandwichshop;
// Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
import java.util.LinkedList;
import java.util.Queue;

import edu.albany.sandwichshop.menu.*;
import edu.albany.sandwichshop.people.Cashier;
import edu.albany.sandwichshop.people.Customer;
import edu.albany.sandwichshop.people.SandwichMaker;

public class EmeraldCityDriver {
	public static void main(String[] args) {
		
		Sandwich s1 = new BLT();
		Sandwich s2 = new RoastBeefSandwich();
		Sandwich s3 = new ChickenSalad();
		
		Cashier cashier = new Cashier("Raynier");
		
		SandwichMaker sm = new SandwichMaker("John");
		
		
		Customer cust1 = new Customer("Glenn", 89.55);
		Customer cust2 = new Customer("Larry", 8.20);
		
		System.out.println("[Customers] : "+ cust1.getName() + " and " + cust2.getName() + " start thinking about their orders.");
		
		cust1.addtoOrder(s1);
		cust2.addtoOrder(s2);
		cust2.addtoOrder(s3);
		
		System.out.println("The Customers get on line");
		Queue<Customer> Line = new LinkedList<Customer>();;
		Line.add(cust1);
		Line.add(cust2);
		
		while(!Line.isEmpty()) {
			
		System.out.println(cashier.getName() + "[Cashier]: *screams* NEXT!!!!");
		
		Customer next = Line.peek();
		System.out.println(Line.remove() + " was next");
		
		cashier.giveInstructions(next);
		
		System.out.println(cashier.getName() + " [Cashier] Sends order to "+ sm.getName() + " [SandwichMaker].");
		for( Sandwich s : cashier.sendOrder(next)) {
			cashier.getCustOrder().add(sm.makeSandwich(s));
			
		}
		cashier.serveCustomer(cashier.getCustOrder(), next);
		cashier.GoodBye();
		
		}
		
		if(Line.isEmpty())
			System.out.println("There is no one else on line, the store is now closed.");
	}
	
}
