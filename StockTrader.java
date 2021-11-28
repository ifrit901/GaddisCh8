package ch8java6thedition;
import java.util.Scanner;
/**
 * This is Code Listing 8.25. It demonstrates the collaberation
 * of the stock related classes.
 * 
 * @author craig
 * 2-1-21
 * 9:47am
 */
public class StockTrader {
	/*
	This program allows you to buy shares of 
	XYZ company's stock.
	*/	
	public static void main(String[]args) {
		int sharesToBuy; 	// Number of shares to buy

		// Create a Stock object for the company stock
		// The trading symbol is "XYZ" and the stock
		// price is currently $9.62.
		Stock xyzCompany = new Stock("XYZ", 9.62);

		// Create a Scanner object for keyboard input
		Scanner input = new Scanner(System.in);

		// Display the current share price
		System.out.println("The current price of XYZ stock is $" 
					+ xyzCompany.getSharePrice());

		// Get the number of shares the user wants to buy
		System.out.println("How many shares of XYZ stock do you "
			           + "want to buy?");
		sharesToBuy = input.nextInt();

		// Create a StockPurchase object for the transaction
		StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);

		// Display the cost of the transaction
		System.out.printf("Cost of the stock: $%,.2f", buy.getCost());
	}
}
