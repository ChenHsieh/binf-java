
// Date: April 19 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab9-1

import java.util.regex.Pattern;
public class PatternMatching {


	public static void main(String[] args) {
		
		Q1("0123");
		Q2("0123");
		Q3("aa0123");
		Q4("aa0123??");
		Q5("2aaa");
	}
	public static boolean Q1(String test) {
//		  returns true if the string contains a, b, or c zero or multiple times
		System.out.println(Pattern.matches(".*[abc]*.*",test));
		return Pattern.matches(".*[abc]*.*",test);
	}

	public static boolean Q2(String test) {
		// returns true if the string contains a, b, or c one or multiple times
		System.out.println(Pattern.matches(".*[abc]+.*",test));
		return Pattern.matches(".*[abc]+.*",test);
	}

	public static boolean Q3(String test) {
		// returns true if the string contains a, b, or c , 2 to 3 times
		System.out.println(Pattern.matches(".*[abc]{2,3}.*",test));
		return Pattern.matches(".*[abc]{2,3}.*",test);
	}
	
	public static boolean Q4(String test) {
		// returns true if the string contains Non Word Characters
		System.out.println(Pattern.matches(".*\\W+.*",test));
		return Pattern.matches(".*\\W+.*",test);
	}
	public static boolean Q5(String test) {
		// returns true if the string starts with a number followed by 3 characters     
		System.out.println(Pattern.matches("^\\d\\D{3}",test));
		return Pattern.matches("[abc].+",test);
	}
	
}
