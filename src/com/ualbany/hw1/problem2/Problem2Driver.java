package com.ualbany.hw1.problem2;
//Raynier Leroux, Assignment 1
public class Problem2Driver {
	public static void main(String[] args) {
		System.out.println("Multiple");
		System.out.println(HW1Problem2.multiple(4,2));
		System.out.println(HW1Problem2.multiple(7,2));
		System.out.println("Remainder");
		System.out.println(HW1Problem2.remainder(7));
		System.out.println(HW1Problem2.remainder(51));
		System.out.println("Distance");
		System.out.println(HW1Problem2.distance(2.2,3.5,4.1,1.8));
		
		HW1Problem2.flipTen();
	}
}
