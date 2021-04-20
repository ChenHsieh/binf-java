import java.util.*;

//Date: April 19 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab9-2
public class LinkedList {

	public static void main(String[] args) {

		// Collection to make an integer linked list
		java.util.LinkedList<Integer> myList = new java.util.LinkedList<Integer>();

		// read the size from keyboard
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of the size: ");
		int number = input.nextInt();
		// get the user input for content of the linked list
		for (int i = 0; i < number; i++) {
			System.out.println("Enter number for the linked list content: ");
			myList.add(input.nextInt());
		}
		
		//call the method and print out
		System.out.println(sumresult(myList));
		input.close();
	}

	public static int sumresult(java.util.LinkedList<Integer> List) {
		//initial the sum variable
		int sum =0;
		// iterate through the linked list and sum up 
		for (int i =0;i<List.size();i++) {
			sum = sum + List.get(i);
		}
		// return calculation
		return sum;
	}

}
