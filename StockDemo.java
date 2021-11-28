package ch8java6thedition;

/**
 * This program tests the Stock class.
 * 
 * @author craig
 * 1-29-21
 * 10:55am
 */
public class StockDemo {
	public static void main(String [] args) {
		// Create a Stock object for XYZ company.
		// The trading symbol is "XYZ" and the 
		// share price is $9.62.
		Stock xyzCompany = new Stock("XYZ", 9.62);

		// Display the stock with the toString method
		System.out.println(xyzCompany);
	}	
}
