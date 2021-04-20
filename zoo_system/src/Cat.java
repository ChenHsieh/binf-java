
public class Cat extends Animal {
	private String color;

	private String sound;

	public Cat(boolean veg, String food, int legs, String color, String sound) {
		super(veg, food, legs);

		this.color = color;
		this.sound = sound;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return this.sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	
	
	public static void main(String[] args) {

	}

}
