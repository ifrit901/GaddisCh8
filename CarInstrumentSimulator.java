package ch8java6thedition;

/**
 * 10. Car Instrument Simulator
 * 
 * For this assignment, you will design a set of classes that
 * work together to simulate a car's fuel gauge and odometer.
 * The classes you will design are the following:
 * 
 * - The FuelGauge Class: This class will simulate a fuel gauge. 
 *   Its responsibilities are as follows:
 * 	- To know the car's current amount of fuel, in gallons.
 * 	- To report the car's current amount of fuel, in gallons.
 *  	- To be able to increment the amount of fuel by 1 gallon.
 * 	  This simulates putting gas in the car.(The car can hold
 *   	  a maxim15 gallons.) 
 * 	- To be able to decrement the amount of fuel by 1 gallon, 
 * 	  if the amount of fuel is greater than 0 gallons. This 
 *	  simulates burning fuel as the car runs.
 * 
 * - The Odometer Class: This class will simulate the car's odometer. 
 *   It's responsibilities are as follows:
 *	- To know the car's current mileage.
 * 	- To report the car's current mileage.
 * 	- To be able to increment the car's mileage by 1 mile. The 
 * 	  maximum mileage the car can store is 999,999 miles. When 
 * 	  this amount is exceeded, the odometer resets to 0 miles.
 * 	- To be able to work with a FuelGage object. It should 
 *	  decrease the FuelGage object's current amount of fuel
 * 	  by 1 gallon every 24 miles traveled. 
 * 
 * Demonstrate the classes by creating an instance of each. Simulate 
 * filling the car up with fuel, and then run a loop that increments 
 * the odometer until the car runs out of fuel. During each loop 
 * iteration, display the cars current mileage and amount of fuel.
 * 
 * 	
 * @author craig
 * 2-9-21
 * 2:46pm
 */
public class CarInstrumentSimulator {
	public static void main(String[]args) {
		// Create one of each object
		Odometer od = new Odometer(0);	// Odometer set to 0

		FuelGage fg = new FuelGage(15); // Tank starts filled

		while(fg.getGallons() > 0) {
			System.out.println("Mileage: " + od.getCurrentMileage()
					+ "\nGallons left: " + fg.getGallons());
			od.milesPerGallon(fg);
			od.incrementMileage();
			System.out.println();
		}
		/*
		At 24 mpg, the car runs out of fuel after 336 miles.
		*/
	}	
}
