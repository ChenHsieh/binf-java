
// Date: April 4 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW5 - 1
public class Animal {

	public static void main(String[] args) {
//		Write a test program that creates at least one Cat and one Bird and displays all the data in each object.
		Cat cat1 = new Cat(false, "canned food", 4, "orange", "meow");
		System.out.println(	
				"vegetarian? " + cat1.getVegetarian() + "\n" +
				"cat eats? " + cat1.getEats() + "\n" +
				"cat legs? " + cat1.getNoOfLegs() + "\n" +
				"cat color? " + cat1.getColor() +  "\n" +
				"cat sounds? " + cat1.getSound() + "\n"
				);

		Bird bird1 = new Bird();
		System.out.println(
				"bird vegetarian? " + bird1.getVegetarian() + "\n" +
				"bird eat? " + bird1.getEats() +  "\n" +
				"bird legs? " + bird1.getNoOfLegs() +  "\n" +
				"bird fly? " + bird1.getFly() + "\n" 
				);

	}

	private boolean vegetarian;
	protected String eats;
	protected int noOfLegs;

	public Animal() {
		this.vegetarian = true;
		this.eats = "animal food";
		this.noOfLegs = 2;
	}

	public Animal(boolean vegetarian, String eats, int noOfLegs) {
		this.vegetarian = vegetarian;
		this.eats = eats;
		this.noOfLegs = noOfLegs;
	}

	public boolean getVegetarian() {
		return this.vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return this.eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return this.noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}
