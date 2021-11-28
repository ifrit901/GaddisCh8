package ch8java6thedition;

/**
 * This is Code Listing 8.6. I think it just passes another 
 * object to a method and changes some of its values.
 * 
 * @author craig
 * 1-26-21
 * 8:50am
 * 
 */
public class PassObject2 {
	public static void main(String[]args) {
		// Create a rectangle object
		Rectangle box = new Rectangle(12.0, 5.0);

		// Display the object's contents
		System.out.println("Rectangle 'box' has a length of " 
			+ box.getLength() +" and a width of " + box.getWidth());

		// Pass a reference to the object to the changeRectangle method
		changeRectangle(box);

		// Display the changed 'box' properties
		System.out.println("\nNow the properties of 'box' are:\n"
			+ "Length: " + box.getLength() 
			+ "Width: " + box.getWidth());
	}	

	public static void changeRectangle(Rectangle r) {
		r.setLength(0.0);
		r.setWidth(0.0);
	}
}
