package ch8java6thedition;

/**
 * This program tests the FullName class and demonstrates
 * its weaknesses.
 * 
 * @author craig
 * 1-30-21
 * 9:36am
 */
public class NameTester {
	public static void main(String[]args) {
		/**
		 * This program creates a Fullname object, and then 
		 * calls the object's getLength method before values are 
		 * established for its reference fields. As a result,
		 * the program will crash.
		 */

		int len;  // To hold the length field

		// Create a FullName object
		FullName name = new FullName();

		// Get the length of the full name
		len = name.getLength();
	}	
}
