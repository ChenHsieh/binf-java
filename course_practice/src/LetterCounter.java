import java.util.Scanner;

// Date: Feb 15 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab 3 - 1

public class LetterCounter {
//	3. Read two strings from keyboard and check if the second string is a substring of first string.
	public static void main(String[] args) {
		// read input strings
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string");
		String string1 = input.nextLine();
		
		// call method
		System.out.print(countLetters(string1));
		
		
		input.close();

	}
	public static int countLetters(String s) {
		int count = 0;
		// go through each character
		for (int i=0; i<s.length(); i++) {
			// check if current character is letter
			if (Character.isLetter(s.charAt(i))) {
				// if true then counter plus one
				count ++;
			}
		}
		return count;
	}
}
