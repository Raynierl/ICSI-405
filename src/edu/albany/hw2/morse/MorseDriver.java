package edu.albany.hw2.morse;

import java.util.Scanner;

public class MorseDriver {
	
	public static void main(String[] args) {
	      //Check for command line arguments
	       if(args.length != 0) {
	    	   System.out.println("Command Line Argument");
	    	   MorseCode.parseStringToMorseCode(args[0]);
	       }
	       else {
	    	   System.out.println("Input your String.");
	    	   Scanner userinput = new Scanner(System.in);
	    	   MorseCode.parseStringToMorseCode(userinput.nextLine());
	    	   userinput.close();
	       }
	      
	}
	
	
}

/* ***********************--Strategy--****************************
 * If each letter has a corresponding Morse code value, 
 * That the same as each letter having an id. Since I am working with a pair
 * I thought a HashMap would be a good choice, plus it removes the need to iterate
 * through the whole Alphabet. I made the methods static because the MorseCode Class
 * does not need to be instantiated and use the static block to generate and fill the map
 * the first time any of the static methods are used.
 */
