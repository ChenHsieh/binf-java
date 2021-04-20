
// Date: Feb 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 2 - 2

public class Hw2_2 {

	public static void main(String[] args) {
		// use a while loop to find the smallest integer that its power of 2 is greater
		// than 12000

		// declare an integer to test
		int i = 1;

		// declare an boolean to control the while loop
		boolean findingNumber = true;

		// start the while loop
		while (findingNumber) {

			// check if the power of 2 is larger than 12000
			if (Math.pow(i, 2) > 12000) {

				// if true then end loop
				findingNumber = false;
			} else {

				// if not yet then increase the number
				i++;
			}
		}

		// print the calculated results and examine the last number
		System.out.println("The number is " + i);
		System.out.println("The power of 2 of " + (i - 1) + " is " + Math.pow(i - 1, 2));
		System.out.println("The power of 2 of " + i + " is " + Math.pow(i, 2));

	}
}
