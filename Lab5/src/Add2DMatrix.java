import java.util.*;

//Date: Mar 8 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 5-2

public class Add2DMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// declare the size of the matrix
		final int N = 3;
		final int M = 3;
		
		// example input 1 2 3 4 5 6 7 8 9 
		
		// get matrix1
		System.out.print("Enter matrix1: ");
		double[][] matrix1 = new double[N][M];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		// get matrix2
		System.out.print("Enter matrix2: ");
		double[][] matrix2 = new double[N][M];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
//		declare the matrix for addition
		double[][] resultMatrix = addMatrix(matrix1, matrix2);
		System.out.println("The addition of the matrices is ");
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[i].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
		}
		input.close();
	}

	public static double[][] addMatrix(double[][] matrix1, double[][] matrix2) {
		double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				// execute the addition
				resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return resultMatrix;
	}
}
