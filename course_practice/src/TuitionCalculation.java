import java.util.Scanner;

// Date: Feb 15 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Lab 3 - 2

public class TuitionCalculation {

	public static void main(String[] args) {
		// read input numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter tuition");
		double tuition = input.nextDouble();
		System.out.println("Enter year");
		int year = input.nextInt();
		
		// call method
		double newTuition = CalculateTuition(tuition, year);
		System.out.printf("The tuition on the %d th year: '%7.5f'%n", year, newTuition);
		input.close();
	}
	
	public static double CalculateTuition(double tuition, int year) {
		// for each year 
		for (int i=0; i<year; i++) {
			// increase the tuition
			tuition = tuition * 1.05;
		}
		return tuition;
	}
}
