package ch8java6thedition;
import javax.swing.JOptionPane;

/**
 * This is Code Listing 8.7. It demonstrates how a 
 * method can return a reference to an object. 
 * 
 * @author craig
 * 1-26-21
 * 9:20am
 * 
 */
public class ReturnObject {
	public static void main(String [] args) {
		BankAccount account;		

		// Get a reference to a bank account object
		account = getAccount();

		// Display the account's balance
		JOptionPane.showMessageDialog(null, "The account has a balance "
			+ "of " + account.getBalance());

		System.exit(0);
	}	

	/**
	 * The getAccount method creates a BankAccount object with 
	 * the balance specified by the user.
	 */

	public static BankAccount getAccount() { 
		String input;   // To hold user input
		double balance; // Account balance

		// Get the balance from the user 
		input = JOptionPane.showInputDialog(null, "Enter the account balance:");
		balance = Double.parseDouble(input); 

		// Create a new BankAccount object and return a reference to it
		return new BankAccount(balance);

	}
}
