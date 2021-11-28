package ch8java6thedition;

/**
 * The ParkedCar class simulates a parked car.
 * 
 * @author craig
 * 2-8-21
 * 11:29am
 */
public class ParkedCar {
	private String make;
	private String model;
	private String licenseNum;
	private int numberOfMinutesParked;

	public ParkedCar() {
		make = "";
		model = "";
		licenseNum = "";
		numberOfMinutesParked = 0;
	}

	public ParkedCar(String make, String model, String licenseNum, 
		int numberOfMinutesParked) {
		this.make = make;
		this.model = model;
		this.licenseNum = licenseNum;
		this.numberOfMinutesParked = numberOfMinutesParked;
	}

	public ParkedCar(ParkedCar object2) {
		numberOfMinutesParked = object2.numberOfMinutesParked;
		make = object2.make;
		model = object2.model;
		licenseNum = object2.licenseNum;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the licenseNum
	 */
	public String getLicenseNum() {
		return licenseNum;
	}

	/**
	 * @param licenseNum the licenseNum to set
	 */
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	/**
	 * @return the numberOfMinutesParked
	 */
	public int getNumberOfMinutesParked() {
		return numberOfMinutesParked;
	}

	/**
	 * @param numberOfMinutesParked the numberOfMinutesParked to set
	 */
	public void setNumberOfMinutesParked(int numberOfMinutesParked) {
		this.numberOfMinutesParked = numberOfMinutesParked;
	}

	@Override
	public String toString() {
		String str = "Make: " + this.make
			   + "\nModel: "+ this.model
			   + "\nLicense Number: " + this.licenseNum;
		return str;
	}

}
