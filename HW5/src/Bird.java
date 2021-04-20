
// Date: April 4 2021
// Name: Chen Hsieh
// Student number: ch29576, 811744663
// Class: BINF 8006
// HW5 - 1
public class Bird extends Animal{
	private boolean fly;

//and two constructors. Default constructor and constructor with the fly variable, get and set methods for fly.
	public Bird(boolean vegetarian, String eats, int noOfLegs, boolean fly){
		super(vegetarian, eats, noOfLegs);
		this.fly = fly;
		
	}
	public Bird() {
		super();
		this.fly = true;
	}
	
	public boolean getFly() {
		return this.fly;
	}
	public void getFly(boolean fly) {
		this.fly = fly;
	}
}
