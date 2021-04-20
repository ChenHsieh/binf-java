
// Date: April 4 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW5 - 1
public class Cat extends Animal {
	private String color;
	private String sound;

// two constructors. Default constructor and constructor with all of the variables including color and sound

	public Cat(boolean vegetarian, String eats, int noOfLegs, String color, String sound) {
		super(vegetarian, eats, noOfLegs);
		this.color = color;
		this.sound = sound;
	}
	public Cat() {
		super();
		this.color = "orange";
		this.sound = "meow";
	}
//	get and set for two variables.
	public String getColor() {
		return color;
	}
	public String getSound() {
		return sound;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
