package ch8java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This program tests the CashRegister class.
 * It gets input from the user to calculate
 * subtotal, tax, and total for the price of 
 * a certain number of items.
 * 
 * @author craig
 */
public class CashRegisterTest {
	public static void main(String[]args) throws IOException{
		int numberOfItems = 0;
		String fileName = "Reciepts.txt";

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);
	
		// Create a Retail_Item object
		Retail_Item item = new Retail_Item("Thing_A_Ma_Bob", 6, 9.99);
		
		// Get number of items from the user
		System.out.println("How many thingamabobs do you wanna buy?");
		numberOfItems = input.nextInt();

		// Create a CashRegister object
		CashRegister purchase = new CashRegister(item, numberOfItems);

		System.out.println(purchase.toString());
		//System.out.println(purchase.getSubTotal());


		FileWriter file = new FileWriter(fileName);
		PrintWriter myFile = new PrintWriter(file);

		myFile.println(purchase.toString());

		myFile.close();
	}	


}
