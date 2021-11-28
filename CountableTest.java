package ch8java6thedition;

/**
 * This program demonstrates the Countable(CodeListing8_1) class.
 * 
 * @author craig
 * 1-25-21
 * 2:08pm
 * 
 */
public class CountableTest {
	public static void main(String[]args) {
		int objectCount;

		// Create three instances of the Countable class
		CodeListing8_1 object1 = new CodeListing8_1();
		CodeListing8_1 object2 = new CodeListing8_1();
		CodeListing8_1 object3 = new CodeListing8_1();

		// Get the number of instances from the class's static field
		objectCount = object1.getInstanceCount();
		System.out.println(objectCount + " instances of the class "
			+ "were created.");
	}	
}
