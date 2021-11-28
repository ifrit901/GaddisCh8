package ch8java6thedition;

/**
 * This class simulates a police officer.
 * 
 * @author craig
 * 2-8-21
 * 1:36pm
 */
public class PoliceOfficer {
	private String name;
	private String licenseNumber;
	private ParkedCar pc;
	private ParkingMeter pm;
	private ParkingTicket pt;

	public PoliceOfficer(String name, String licenseNumber) {
		this.name = name;	
		this.licenseNumber = licenseNumber;
	}
	
	public PoliceOfficer(PoliceOfficer po) {
		this.name = po.name;
		this.licenseNumber = po.licenseNumber;
	}

	public void examineParkedCar(ParkedCar pc, ParkingMeter pm, PoliceOfficer po) {
		if(pc.getNumberOfMinutesParked() > pm.getMinutesOfTimePurchased()) {
			pt = new ParkingTicket(pc, pm, po); 
			pt.issueTicket(pc, pm, po);
			System.out.println("This car is parked illegally:\n"
				+ pc.toString() + "\n"
				+ "The car's time has been expired for " 
				+ (pc.getNumberOfMinutesParked() - pm.getMinutesOfTimePurchased()) 
				+ " minutes.\n"
				+ "Issued by officer: " + po.toString());
		}
		else
			System.out.println("This car is parked legally.");
	}

	@Override
	public String toString() {
		String str = this.name + " " + this.licenseNumber;
		return str;
	}
}
