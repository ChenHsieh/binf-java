//Date: Feb 8 2021
//Name: Chen Hsieh
//Student number: ch29576, 811744663
//Class: BINF 8006
//Lab 2 2  

public class Lab2_2 {
	public static void main(String[] args) {

//		Write a program to generate a plate number.
//		three uppercase letters followed by four digits. 
		
		for (int i = 0; i < 3; i++) {
			char randomUpperCaseLetter = (char)('A' + (int)(Math.random() * 26));
			System.out.print(randomUpperCaseLetter);
		}
//		random four digit
//		(int)(Math.random() * 26)
		for (int i = 0; i < 4; i++) {
			int randomNumber = (int)(Math.random() * 10);
			System.out.print(randomNumber);
		}
	}
}
	
	
