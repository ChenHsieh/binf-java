
// Date: Mar 29 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab 7

// using recursion to find the value of x to the power of y
public class Xpowy {
	// main testing area
	public static void main(String[] args) {
		// set up the testing number x and y
		int x = 2;
		int y = 10;
		// call the recursion method and print out the result
		System.out.print(getPow(x, y));

	}

	// define the method
	public static int getPow(int x, int y) {

		// base case if when the y reach 1 then simply return x
		if (y == 1) {
			return x;
		} else {
			// if y is still larger than 1, we have to figure out is it even or odd to devide it
			if (y % 2 == 0) {
				// if y is even number, divide it and call the method itself
				return getPow(x, y / 2) * getPow(x, y / 2);
			} else {
				// if y is odd number, multiply the x and two divided part
				return x * getPow(x, y / 2) * getPow(x, y / 2);
			}

		}
	}
}
