
public class SimpleRectangle {

	public static void main(String[] args) {
		// Create a rec with radius 1
		MyRectangle rec1 = new MyRectangle();
		System.out.println("The area of the rec of width " + rec1.width + "and height " + rec1.height + " is " + rec1.getArea());

		// Create a rec with radius 25 and height 46
		MyRectangle rec2 = new MyRectangle(25, 46);
		System.out.println("The area of the rec of width " + rec2.width + "and height " + rec2.height + " is " + rec2.getArea());

		// Create a rec with width 125 and height 46
		MyRectangle rec3 = new MyRectangle(125, 46);
		System.out.println("The area of the rec of width " + rec3.width + "and height " + rec3.height + " is " + rec3.getArea());
		// SimpleCircle circle4= new SimpleCircle(5);
		// Modify circle radius
		circle2.radius = 100; // or circle2.setRadius(100)
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		System.out
				.println("The perimeter  of the circle of radius " + circle2.radius + " is " + circle2.getPerimeter());
	}
}
