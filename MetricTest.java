package ch8java6thedition;
import javax.swing.JOptionPane;
/**
 * This is Code Listing 8.4. It tests the Metric class.
 * 
 * @author craig
 * 1-25-21
 * 2:27pm
 * 
 */
public class MetricTest {
	public static void main(String[]args) {
		String input; // To hold user input
		double miles; // To hold miles
		double kilos; // To hold kilometers

		// Get a distance in miles
		input = JOptionPane.showInputDialog("Enter a distance in miles.");
		miles = Double.parseDouble(input);

		// Convert the distance to kilometers
		kilos = Metric.milesToKilometers(miles);
		JOptionPane.showMessageDialog(null, String.format("%,.2f miles "
			+ "equals %,.2f kilometers.", miles, kilos)); 

		// Get a distance in kilometers
		input = JOptionPane.showInputDialog("Enter a distance in miles.");
		kilos =  Double.parseDouble(input);

		// Convert the distance to miles
		miles = Metric.kilometersToMiles(kilos);
		JOptionPane.showMessageDialog(null, String.format("%,.2f kilometers "
			+ "equals %,.2f miles.", kilos, miles));

		System.exit(0);
	}	
}
