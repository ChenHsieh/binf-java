import java.util.*;

// Date: Mar 11 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW 3 - 2
public class Hw3_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// declare the size of the score matrix
		final int studentNumber = 5;
		final int examNumber = 3;
		// get score matrix from keyboard
		// example input for each student: 98 85 67
		System.out.println("Enter scores ");
		// although the question asked us to declare a int matrix, I modified it to double here for the average calculation
		double[][] scoreMatrix = new double[studentNumber][examNumber + 1];
		for (int i = 0; i < studentNumber; i++) {
			// prepare a variable to calculate average
			double average = 0;
			for (int j = 0; j < examNumber; j++) {
				System.out.printf("Entering score of student number %d's Exam number %d %n", i + 1, j + 1);
				// read in score
				scoreMatrix[i][j] = input.nextInt();
				// add on the partial average
				average += scoreMatrix[i][j] / examNumber;
			}

			// register the semester average
			scoreMatrix[i][examNumber] = average;
		}
		// print the header
		String format = "%-17s%-17s%-17s%-17s%-17s%n";
		System.out.printf(format, "Student_number", "Exam1", "Exam2", "Exam3", "Average");

		// go through the content and print them out into the table format
		for (int i = 0; i < scoreMatrix.length; i++) {
			System.out.printf("%-17s", "number" + i);
			for (int j = 0; j < scoreMatrix[i].length; j++) {
				System.out.printf("%-17s", scoreMatrix[i][j]);
			}
			System.out.println();
		}
		input.close();
	}

}
