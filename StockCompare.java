package ch8java6thedition;

/**
 * This is Code Listing 8.10. It uses the custom equals
 * method in the Stock class to compare two objects.
 * 
 * @author craig
 * 1-29-21
 * 11:02am
 */
public class StockCompare {
	public static void main(String[]args) {
		Stock stock1 = new Stock("XYZ", 9.62);
		Stock stock2 = new Stock("XYZ", 9.62);

		if(stock1.equals(stock2)) {
			System.out.println("The stocks are equal.");
		}
		else
			System.out.println("The stocks are not equal.");
	}		
}
