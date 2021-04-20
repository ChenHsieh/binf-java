import java.util.Scanner;

//Date: Feb 13 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//HW 1-3

public class HW1_3 {
//	3. Read two strings from keyboard and check if the second string is a substring of first string.
	public static void main(String[] args) {
		// read input strings
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = input.nextLine();
		System.out.println("Enter next string");
		String string2 = input.nextLine();
		
		// check if substring
		if (string1.indexOf(string2) == -1) {
			System.out.println("Second string is NOT a substring of first string.");
		} else {
			System.out.println("Second string is a substring of first string.");
		}
		input.close();

	}
}
