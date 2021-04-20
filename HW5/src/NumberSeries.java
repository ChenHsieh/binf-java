
// Date: April 4 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW5 - 2
public class NumberSeries {

	public static void main(String[] args) {
//		loop through each assigned number
		for (int j = 1; j < 11; j++) {
			System.out.println(j);
			// send to the method
			System.out.println(m(j * 1.0));
		}

	}

	public static double m(double i) {
		// check if it is base case
		if (i == 1.0) {
//			the base case so return the number of i = 1
			return i / (2 * i + i);
		} else {
			// get the next little m series number
			return i / (2 * i + 1) + m(i - 1);
		}
	}

}
