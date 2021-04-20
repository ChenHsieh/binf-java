// Date: Mar 18 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// Midterm question 2

public class BMIcalculation {
	String name;
	double weight; // in Kilograms
	double height; // in meter

	public BMIcalculation(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public double getBMI() {
		// Find BMI
		double BMI = this.weight / Math.pow(this.height, 2);
		return BMI;
	}

	public String getStatus() {
		// return Obese or not based on BMI
		if (getBMI() >= 30) {
			return "Obese";
		} else {
			return "not";
		}
	}

	public String getName() {
//		Return Name
		return this.name;
	}

	public String getWeight() {
		// Return Weight
		return this.weight + "";
	}

	public String getHeight() {
		// Return Height
		return this.height + "";
	}

	public static void main(String[] args) {
		// testing code

		// normal student
		System.out.println("case 1");
		BMIcalculation student1 = new BMIcalculation("John", 75, 1.8);
		System.out.println(student1.getBMI());
		System.out.println(student1.getStatus());
		System.out.println(student1.getName());
		System.out.println(student1.getWeight());
		System.out.println(student1.getHeight());
		System.out.println();
		// Obese case
		System.out.println("case 2");
		BMIcalculation student2 = new BMIcalculation("Big O", 130, 1.8);
		System.out.println(student2.getBMI());
		System.out.println(student2.getStatus());
		System.out.println(student2.getName());
		System.out.println(student2.getWeight());
		System.out.println(student2.getHeight());
		System.out.println();
	}

}
