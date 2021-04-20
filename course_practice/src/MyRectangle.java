
public class MyRectangle {
	double width = 1;
	double height = 1;

	/** Construct a circle with radius 1 */
	MyRectangle() {

	}

	/** Construct a circle with a specified radius */
	MyRectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	/** Return the area of this circle */
	double getArea() {
		return width * height;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * (height + width);
	}
}
