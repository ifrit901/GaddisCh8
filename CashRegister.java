package ch8java6thedition;

/**
 * This is the CashRegister class. It gets used with the 
 * RetailItem class from chapter 6.
 * 
 * 6. Write a CashRegister class that can be used with the 
 * RetailItem class. The CashRegister class should simulate 
 * the sale of a retail item. It should have a constructor 
 * that accepts a RetailItem as an argument. The constructor
 * should also accept an integer that represents the number
 * of items being purchased. In addition, the class should 
 * have the following methods:
 * 
 * - The getSubTotal method should return the subtotal of the sale, 
 *   which is the quantity multiplied by the price. This method
 *   must get the price from the RetailItem object that was 
 *   passed as an argument from the constructor. 
 * - The getTax method returns the amount of sales tax on the
 *   purchase. The sales tax rate is 6% of a retail sale.
 * - The getTotal method should return the total of the sale, 
 *   which is the subtotal plus the tax.
 * 
 * Demonstrate the class in a program that asks the user for the 
 * quantity of items being purchased, and displays the subtotal,
 * amount of sales tax, and total.
 * 
 * @author craig
 * 
 */
public class CashRegister {
	private final Retail_Item ri;		
	private double subTotal;
	private double totalPrice;
	private final double taxRate = .06;
	private double taxTotal;
	private final int numberBeingPurchased;

	public CashRegister(Retail_Item ri, int numberBeingPurchased) {
		this.ri = new Retail_Item(ri);
		this.numberBeingPurchased = numberBeingPurchased;
		
	}

	public int getNumberBeingPurchased() {
		return numberBeingPurchased;
	}
	
	public double getSubTotal() {
		subTotal = ri.getPrice() * numberBeingPurchased;
		return subTotal;
	}
	
	public double getTax() {
		taxTotal = getSubTotal() * taxRate;
		return taxTotal;
	}

	public double getTotal() {
		totalPrice = getSubTotal() + getTax();
		return totalPrice;
	}

	public String toString() {
		String str = "SALES RECEIPT"  
			+ "\nUnit Price: $" + ri.getPrice()
			+ "\nQuantity: " + numberBeingPurchased
			+ "\nSubtotal: $" + String.format("%,.2f", getSubTotal())
			+ "\nSales Tax: $" + String.format("%,.2f", getTax())
			+ "\nTotal: $" + String.format("%,.2f", getTotal());
			
		return str;
		
	}
}
