package edu.albany.hw2.morse;

import java.util.HashMap;

public class MorseCode {
	
	private static HashMap<Character,String> MorseCodeMap = new HashMap<Character,String>();
	
	static {
		GenerateMap();
	}
	
	public static void parseStringToMorseCode(String input) {
		
		 char[] toChar = input.toUpperCase().toCharArray();
		for( char c : toChar ) {
			if( c == ' ')
				System.out.print("   ");
			else if(MorseCodeMap.get(c) != null)
				System.out.print(MorseCodeMap.get(c));		
		}
		
	}
	
	private static void GenerateMap() {
		
		//Numeric Values
		MorseCodeMap.put('0',"----");
		MorseCodeMap.put('1',".----");
		MorseCodeMap.put('2',"..---");
		MorseCodeMap.put('3',"...--");
		MorseCodeMap.put('4',"....-");
		MorseCodeMap.put('5',".....");
		MorseCodeMap.put('6',"-....");
		MorseCodeMap.put('7',"--...");
		MorseCodeMap.put('8',"---..");
		MorseCodeMap.put('9',"----.");
		
		//Space and Punctuation Marks
		MorseCodeMap.put(' '," ");
		MorseCodeMap.put(',',"--..--");
		MorseCodeMap.put('.',".-.-.-");
		MorseCodeMap.put('?',"..--..");
		MorseCodeMap.put('1',".----");
		
		//Alphabetical Letters
		MorseCodeMap.put('A',".-");
		MorseCodeMap.put('B',"-...");
		MorseCodeMap.put('C',"-.-.");
		MorseCodeMap.put('D',"-..");
		MorseCodeMap.put('E',".");
		MorseCodeMap.put('F',"..-.");
		MorseCodeMap.put('G',"--.");
		MorseCodeMap.put('H',"....");
		MorseCodeMap.put('I',"..");
		MorseCodeMap.put('J',".--");
		MorseCodeMap.put('K',"-.-");
		MorseCodeMap.put('L',".-..");
		MorseCodeMap.put('M',"--");
		MorseCodeMap.put('N',"-.");
		MorseCodeMap.put('O',"---");
		MorseCodeMap.put('P',".--.");
		MorseCodeMap.put('Q',"--.-");
		MorseCodeMap.put('R',".-.");
		MorseCodeMap.put('S',"...");
		MorseCodeMap.put('T',"-");
		MorseCodeMap.put('U',"..-");
		MorseCodeMap.put('V',"...-");
		MorseCodeMap.put('W',".--");
		MorseCodeMap.put('X',"-..-");
		MorseCodeMap.put('Y',"-.--");
		MorseCodeMap.put('Z',"--..");
		
	}
	
}


