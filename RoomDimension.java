package ch8java6thedition;

/**
 * This is the RoomDimension class. 
 * 
 * @author craig
 * 2-3-21
 * 5:49am
 */
public class RoomDimension {
	// Instance fields
	private double length;
	private double width;

	// Copy constructor
	public RoomDimension(RoomDimension rd) {
		this.length = rd.length;
		this.width = rd.width;
	}
	
	public RoomDimension(double l, double w) {
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
