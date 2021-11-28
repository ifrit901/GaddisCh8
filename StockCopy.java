package ch8java6thedition;

/**
 * This is Code Listing 8.11. It demonstrates the stockCopy 
 * method.
 * 
 * @author craig
 * 1-29-21
 * 11:51am
 */
public class StockCopy {
	public static void main(String [] args) {
		// Create a new Stock object
		Stock stock1 = new Stock("XYZ", 9.62);

		// Create a new Stock object and make it equal to
		// the first one
		Stock stock2 = stock1.copy();

		// Display the contents of each object
		System.out.println("Stock 1: " + stock1
				+ "\nStock2: " + stock2);

		// Confirm that they reference two seperate objects
		if(stock1 == stock2) {
			System.out.println("stock1 and stock2 reference the "
				+ "same object.");
		}
		else
			System.out.println("stock1 and stock2 reference two"
				+ " different objects.");

		// Compare the two to see if they are equal. 
		if(stock2.equals(stock1)) {
			System.out.println("The stocks are equal.");
		}
		else
			System.out.println("The stocks are not equal.");
	}	
}
