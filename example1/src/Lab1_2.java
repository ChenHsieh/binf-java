//Date: Feb 1 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 1 


import java.util.Scanner;
public class Lab1_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 1-12");
		int number = input.nextInt();
		if (number > 12 || number < 1) {
			System.out.println("number is not acceptable");
			System.exit(0);
		}

		switch (number) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}

		input.close();
	}

}
