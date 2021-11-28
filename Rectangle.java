package ch8java6thedition;

/**
 * This is just so the PassObject example will have an
 * available class to reference from.
 * 
 * @author craig
 * 1-26-21
 * 6:39am
 * 
 */
public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {

	}
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public void setLength(double l) {
		length = l;
	}

	public void setWidth(double w) {
		width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getArea() {
		return length * width;
	}


}
