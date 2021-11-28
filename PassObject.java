package ch8java6thedition;

/**
 * This is Code Listing 8.5. It demonstrates passing an 
 * object to a method. 
 * 
 * @author craig
 * 1-25-21
 * 4:30pm
 * 
 */
public class PassObject {
	public static void main(String[]args) {
		// Create a Rectangle object
		Rectangle box = new Rectangle(12.0, 5.0);

		// Pass a reference to the object to
		// the displayRectangle method
		displayRectangle(box);

	}	

	public static void displayRectangle(Rectangle r) {
		// Display the length and width
		System.out.println("Length: " + r.getLength() + "\n"
				 +  "Width: " + r.getWidth());
	}
}
