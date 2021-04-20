
// Date: Feb 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 2 - 3

public class Hw2_3 {

	public static void main(String[] args) {
		// print a table of square root of numbers from 0 to 20
		System.out.println("A table of Square root (Table of square can be found below the first table).");
		
		// prepare a format for each row
		String format = "%-10s%s%n";
		// prepare a format for float number
		String formatFloat = "%.2f";
		// print the header
		System.out.printf(format, "Number", "Square root");

		// use the for loop to go through all numbers assigned by the question prompt
		for (int i = 0; i < 21; i++) {

			// print the number and the calculated square root
			System.out.printf(format, 
					i, 
					String.format(formatFloat, Math.sqrt(i))
					);
		}
		System.out.println("");
		// the second table in case the square value is wanted
		System.out.println("Table of square value");
		System.out.printf(format, "Number", "Square");
		// use the for loop to go through all numbers assigned by the question prompt
		for (int i = 0; i < 21; i++) {

			// print the number and the calculated square
			System.out.printf(format, 
					i, 
					(int)Math.pow(i,2)
					);
		}
	}
}
