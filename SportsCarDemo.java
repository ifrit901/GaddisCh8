package ch8java6thedition;

/**
 * This program demonstrates the SportsCar class.
 * 
 * @author craig
 * 1-30-21
 * 8:40pm
 */
public class SportsCarDemo {
	public static void main(String[]args) {
		// Demonstrate the SportsCar class
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 100000);

		// Display the object's new values
		System.out.println(yourNewCar);
	}	
}
