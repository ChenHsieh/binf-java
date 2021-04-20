
/**
 * Lab4 -1 find minimum from input list of 4
 */

// Date: Feb 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab 4 - 1
import java.util.Scanner;

public class FindMin {
	public static void main(String[] args) {
		// Scan input

		Scanner input = new Scanner(System.in);
		// in the for loop, get input and save in an array
		double[] numberList = new double[5];
		for (int i = 0; i < numberList.length; i++) {
			System.out.println("Enter number " + (i + 1) + ":");
			numberList[i] = input.nextDouble();
		}
		// send to method and print
		System.out.print(minimum(numberList));
		input.close();

	}

	public static double minimum(double[] List) {
		// use for loop so that this method can deal with input with different length of
		// array
		double currentMin = List[0];
		for (int i = 0; i < List.length; i++) {
			// if the new element from array is smaller then substitute currentMin
			currentMin = Math.min(currentMin, List[i]);
		}
		return currentMin;
	}
}