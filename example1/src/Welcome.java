


import java.util.Scanner;
public class Welcome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter height");
		double h = input.nextDouble();
		
		System.out.println("Enter width");
		double w = input.nextDouble();
		
		double area = h * w;
		double perimeter = (h + w) * 2;
		
		System.out.println("The area: " + h + " * " + w + " is " + area);
		System.out.println("The perimeter:" + h + " + " + w + " * 2 is " + perimeter);
		input.close();
	}
}