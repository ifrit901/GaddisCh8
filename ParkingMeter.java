package ch8java6thedition;

/**
 * The ParkingMeter class simulates a parking meter.
 * 
 * @author craig
 * 2-8-21
 * 11:32am
 */
public class ParkingMeter {
	private int minutesOfTimePurchased;	

	public ParkingMeter() {
		minutesOfTimePurchased = 0;
	}

	public ParkingMeter(int minutesOfTimePurchased) {
		this.minutesOfTimePurchased = minutesOfTimePurchased;
	}

	public ParkingMeter(ParkingMeter object2) {
		this.minutesOfTimePurchased = object2.minutesOfTimePurchased;
	}
	/**
	 * @return the minutesOfTimePurchased
	 */
	public int getMinutesOfTimePurchased() {
		return minutesOfTimePurchased;
	}

	/**
	 * @param minutesOfTimePurchased the minutesOfTimePurchased to set
	 */
	public void setMinutesOfTimePurchased(int minutesOfTimePurchased) {
		this.minutesOfTimePurchased = minutesOfTimePurchased;
	}
}
