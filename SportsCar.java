package ch8java6thedition;

/**
 * This is Code Listing 8.21, the SportsCar class.
 * 
 * @author craig
 * 1-30-21
 * 4:30pm
 */
public class SportsCar {
	private CarType make;	// The car's make
	private CarColor color; // The car's color
	private double price;	// The car's cost

	/**
	 * The constructor initializes the car's make, 
	 * color and price.
	 * @param aMake The car's make
	 * @param aColor The car's color
	 * @param aPrice The car's price
	 */
	public SportsCar(CarType aMake, CarColor aColor, double aPrice) {
		make = aMake;
		color = aColor;
		price = aPrice;
	}

	/**
	 * The getMake method 
	 * @return The car's make 
	 */
	public CarType getMake() {
		return make;
	}

	/**
	 * The getColor method 
	 * @return The car's color
	 */
	public CarColor getColor() {
		return color;
	} 

	/**
	 * The getPrice method 
	 * @return The car's price 
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * The toString method 
	 * @return the object's data as a String 
	 */
	public String toString() {
		String str = String.format("Make: %s\nColor: %s\nPrice: %,.2f",
						make, color, price);
		return str;
	}
}
