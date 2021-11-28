package ch8java6thedition;

/**
 * The Odometer Class.
 * 
 * @author craig
 */
public class Odometer {
	private int currentMileage;
	private FuelGage fg;

	public Odometer(int mileage) {
		currentMileage = mileage;
	} 
		
	public int getCurrentMileage() {
		return currentMileage;
	}

	public void incrementMileage() {
		if(currentMileage < 999999) {
			currentMileage++;
		}
	}

	public void milesPerGallon(FuelGage fg) {
		if(currentMileage % 24 == 0) {
			fg.decrementGallons();
		}
	}

	
}
