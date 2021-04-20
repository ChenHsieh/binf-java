import java.util.Scanner;

// Date: April 4 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW5 - 3
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");   
		// get input number
		int i = input.nextInt();
		// call the method
		System.out.println(f(i));
		//close input
		input.close();

	}
	
	public static int f(int i) {
	// define base case as 0
		if (i == 0) {
			return 0;
		}else {
			// define base case as 1
			if (i == 1) {
				return 1;
			} else {
				// get the calculation as definition in the question
				return f(i-1)+ f(i-2);
			}
		}
	}
}
