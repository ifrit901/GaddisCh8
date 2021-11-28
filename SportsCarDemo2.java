package ch8java6thedition; /**
 * This is Code Listing 8.23.
 * 
 * @author craig
 * 1-30-21
 */
public class SportsCarDemo2 {
	/**
	 * This program demonstrates "turning on" an 
	 * enumerated data type.
	 */	
	public static void main(String[]args) {
		// Create a new SportsCar object
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 100000);

		// Get the car make and switch on it
		switch(yourNewCar.getMake()) 
		{
			case PORSCHE:
				System.out.println("Your car was made in Germany.");
				break;

			case FERRARI:
				System.out.println("Your car was made in Italy.");
				break;
			
			case JAGUAR:
				System.out.println("Your car was made in England.");
				break;

			default:
				System.out.println("I'm not sure where your car "
					+ "was made.");
		}
	}
}
