//Date: Feb 8 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 2 1  


import java.util.Scanner;
public class Lab2_1 {
	public static void main(String[] args) {

//		get input from user		

		Scanner input = new Scanner(System.in);

		System.out.println("Enter student code");
		    
		String str= input.nextLine();         
		
//		parse the input of student code for following procedure
		
		char major = str.charAt(0);
		char year = str.charAt(1);
		
//		Switch to check what does the student major	
//		M: Mathematics
//		C: Computer Science
//		I: Information Technology


		switch (major) {
		case 'M':
			System.out.print("Mathematics ");
			break;
		case 'C':
			System.out.print("Computer Science ");
			break;
		case 'I':
			System.out.print("Information Technology ");
			break;
		default:
			
			System.out.println("no match for major code");
			System.exit(0);
		}
		
		
		// switch to detect how old the student is 
//			1: freshman
		//
//			2: sophomore
		//
//			3:  junior
		//
//			4:  senior.
		switch (year) {
		case '1':
			System.out.println("freshman");
			break;
		case '2':
			System.out.println("sophomore");
			break;
		case '3':
			System.out.println("junior");
			break;
		case '4':
			System.out.println("senior");
			break;
		default:
			System.out.println(", but no match for year code");
			System.exit(0);
			
		}
		

		input.close();
	}

}
