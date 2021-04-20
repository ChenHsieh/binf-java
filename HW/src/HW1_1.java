import java.util.Scanner;

//Date: Feb 13 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//HW 1-1


public class HW1_1 {

	public static void main(String[] args) {
		// read double number 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter double number");   
		double i= input.nextDouble();
		// turn the double number into string
		String s = "" + i;
		// get the index of the float point in the string of number
		int point = s.indexOf('.');
		// get the substring of the number, which is the digit just ahead of the point
		String result = s.substring(point-1, point);
		// print the result
		System.out.print(result);
		input.close();
	}

}
