package ch8java6thedition;

/**
 * This is Code Listing 8.8, the stock class.
 * 
 * @author craig
 */
public class Stock {
	private String symbol;
	private double sharePrice;

	/**
	 * Constructor
	 * @param symbol The trademark symbol for the stock
	 * @param sharePrice The value of the stock
	 */
	public Stock(String sym, double price) {
		symbol = sym;
		sharePrice = price;
	}

	/**
	 * The copy constructor
	 * @param object2 
	 */
	public Stock(Stock object2) {
		symbol = object2.symbol;
		sharePrice = object2.sharePrice;
	}

	/**
	 * getSymbol method
	 * @return The trademark symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * getSharePrice method
	 * @return The price of the stock
	 * 
	 */
	public double getSharePrice() {
		return sharePrice;
	}

	/**
	 * toString method
	 * @return A String representing the stock's 
	 * symbol and price
	 */
	public String toString() {
		String str = "Trading symbol: " + symbol
			     + "\nShare Price: " + sharePrice;
		return str;
	} 

	/**
	 * equals method
	 * @param object2 The Stock object to be compared
	 * @return The boolean value 
	 */
	public boolean equals(Stock object2) {
		boolean status;

		// Determine whether this object's trade symbol 
		// and stock price are the same
		if(symbol.equals(object2.symbol) &&
			sharePrice == object2.sharePrice) {
			status = true;
		}
		else 
			status = false;

		// Return the value in status
		return status;
	}

	/**
	 * copy method
	 * @return A new Stock object with the same symbol 
	 * and share price of the calling object.
	 */
	public Stock copy() {
		Stock stockCopy = new Stock(symbol, sharePrice);
		return stockCopy;
	}
}
