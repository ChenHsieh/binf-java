
// Date: Feb 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 2 - 1

public class Hw2_1 {

	public static void main(String[] args) {
		// display all the numbers from 100 to 1000, ten per line, divisible by 5 and 6

		// prepare an array as a buffer
		int[] line = new int[10];
		// prepare an index for the buffer array
		int j = 0;

		// go through the whole range
		for (int i = 100; i <= 1000; i++) {
			// check if divisible by 5 and 6
			if (i % 5 == 0 && i % 6 == 0) {

				// set the value and increase the index
				line[j] = i;
				j++;
				// next line when there are ten element in one line
				if (j > 9) {
					j = 0;
					for (int element : line) {
						System.out.print(element);
						// space as delimiter
						System.out.print(" ");
					}
					// change line
					System.out.println("");
					// reset the buffer
					line = new int[10];

				}
			}
		}
	}
}
