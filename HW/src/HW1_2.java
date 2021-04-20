import java.util.Scanner;

//Date: Feb 13 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//HW 1-2

public class HW1_2 {
//	Write a program to Read a letter A to F and print the numeric value for the grade. A is 4, B is 3, is 2, D is 1 and F is 0
	public static void main(String[] args) {
		// read input letter
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter for grade");
		char letter = input.next().charAt(0);

		// detect input and turn it into numeric grade	
		switch (letter) {
		case 'A':
			System.out.println("4");
			break;
		case 'B':
			System.out.println("3");
			break;
		case 'C':
			System.out.println("2");
			break;
		case 'D':
			System.out.println("1");
			break;
		case 'F':
			System.out.println("0");
			break;
		default:
			System.out.println("invalid input");
		}

		input.close();

	}
}
