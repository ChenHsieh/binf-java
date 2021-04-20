
import java.util.Scanner;
public class digitSum2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter 1-1000");
		int number = input.nextInt();
		
		int digit1 = number / 100;
		
		int digit2 = (number % 100) / 10;
		
		int digit3 = number % 10;
		
		int sum = digit1 + digit2 + digit3; 
		
		System.out.printf("The sum of %d, %d, and %d is %d.", digit1, digit2, digit3, sum);
		input.close();
	}
}