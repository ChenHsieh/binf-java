
import java.util.*;

public class Bmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("weight in kilogram");
		double weight = input.nextDouble();

		System.out.print("height in Meter");
		double height = input.nextDouble();

		double bmi = weight / (height * height);
		
		if (bmi > 20) {
			System.out.println("20");
		} else if (bmi > 21) {
			System.out.println("30");
		
		}
		input.close();
		

	}
}
