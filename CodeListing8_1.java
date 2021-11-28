package ch8java6thedition;

/**
 * This is Code Listing 8.1
 * It demonstrates a static field that keeps a count of 
 * the number of instances of the class that are created.
 * 
 * @author craig
 * 1-25-21
 * 1:03pm
 * 
 */
public class CodeListing8_1 {
	private static int instanceCount = 0;	

	/**
	 * The constructor increments the static field
	 * instanceCount. This keeps track of the number
	 * of instances of this class that are created.
	 */

	public CodeListing8_1() {
		instanceCount++;
	}

	public int getInstanceCount() {
		return instanceCount;
	}
}
