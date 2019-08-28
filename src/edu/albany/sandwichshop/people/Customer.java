package edu.albany.sandwichshop.people;
//Raynier Leroux, ICSI - 405 Assignment 3, 4/14/19
import java.util.ArrayList;
import java.util.List;

import edu.albany.sandwichshop.menu.Sandwich;

public class Customer {
	private String name;
	private ArrayList<Sandwich> Tray = new ArrayList<Sandwich>();
	
	private double wallet;
	private List<Sandwich> Order = new ArrayList<Sandwich>();
	
	public Customer(String name, double wallet) {
		this.name = name; this.wallet = wallet;
	}
	public List<Sandwich> getOrder() { return Order; }
	public String getName() { return name; }
	public double getWallet() { return wallet; }
	public void addtoOrder(Sandwich s) {Order.add(s);}
	public void receiveOrder(ArrayList<Sandwich> s) { this.Tray = s;  System.out.println(this.name + " says Thank You!"); }
	@Override
	public String toString() { return (this.name); }

}
