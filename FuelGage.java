package ch8java6thedition;

/**
 * The FuelGage Class.
 * 
 * @author craig
 */
public class FuelGage {
	private int numberOfGallons;	

	public FuelGage(int gallons) {
		numberOfGallons = gallons;
	}

	public int getGallons() {
		return numberOfGallons;
	}

	public void incrementGallons() {
		if(numberOfGallons < 15)
		 	numberOfGallons++;
	}

	public void decrementGallons() {
		if(numberOfGallons > 0) 
			numberOfGallons--;
	}
}
