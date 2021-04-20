import java.util.*;

// Date: Mar 11 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 3 - 1

public class Hw3_1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// first get the length of the lists
		System.out.print("Enter length of list: ");
		int n = input.nextInt();

		// read in the list content from terminal
		System.out.print("Enter list1: ");
		int[] list1 = new int[n];
		for (int i = 0; i < n; i++) {
			list1[i] = input.nextInt();
		}
		// read in the second list content from terminal
		System.out.print("Enter list2: ");
		int[] list2 = new int[n];
		for (int i = 0; i < n; i++) {
			list2[i] = input.nextInt();
		}
		// call the method for comparison of two list elements
		Boolean comparison = equals(list1, list2);
		// print out the result from the method
		System.out.print(comparison);
		// close the scanner
		input.close();
	}

	public static Boolean equals(int[] list1, int[] list2) {
		// get the length of the list for the for loop
		int n = list1.length;
		// set initial value for the result
		Boolean result = true;
		// once there is a difference in the element
		// the result will be set to false and end the loop 
		for (int i = 0; i < n; i++) {
			if (!(list1[i] == list2[i])) {
				result = false;
				break;
			}
		}
		return result;
	}
}
