package com.ualbany.hw1.problem2;
//Raynier Leroux, Assignment 1
import java.security.SecureRandom;

public class HW1Problem2 {
	public static boolean multiple(int x, int y) {
		if(x % y == 0)
			return true;
		return false;
	}
	public static int remainder(int x) {
		return (x%7);
	}
	public static  double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt( Math.pow( (x2-x1), 2) + Math.pow( (y2-y1) , 2));
	}
	
	public static void flipTen() {
		for(int i=1; i<=10; i++) {
		SecureRandom r = new SecureRandom();
		
		switch( (1 + r.nextInt(2) ) )
				{
		case 1:
			System.out.print(i + ": Heads ");
			break;
		case 2:
			System.out.print(i + ": Tails ");
			break;
				}
		}
	}
		
}
