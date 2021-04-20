
/**
 *  *   Write a program to declare array myList in main and use method to shift elements of array right one position. Print myList before shift and after in main method. 
 */

// Date: Feb 22 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab 4 - 2
import java.util.Arrays;

public class ShiftRight {
	public static void main(String[] args) {
		// declare an array
		double[] myList = { 5.0, 2.3, 7.5, 6.2, 1 };
		// print the original result
		System.out.println("List before shift  " + Arrays.toString(myList));
		// get the result from method
		System.out.println("List after shift right  " + Arrays.toString(shiftRight(myList)));
	}

	public static double[] shiftRight(double[] List) {
		// prepare a new array for manipulation
		double[] result = new double[List.length];
		System.arraycopy(List, 0, result, 0, List.length);
		// use temp to save the last element
		double temp = result[List.length - 1];
		// for each element, replace it with the left one element
		for (int i = 0; i < List.length - 1; i++) {
			result[i + 1] = result[i];
		}
		// fill the first element with temp
		result[0] = temp;
		// return the shifted array
		return result;
	}
}
