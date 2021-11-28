package ch8java6thedition;

/**
 * This class should simulate a parking ticket.
 * 
 * @author craig
 * 2-8-21
 * 11:42am
 */
public class ParkingTicket {
	private ParkedCar pc;
	private double fine;
	private PoliceOfficer po;
	private ParkingMeter pm;

	public ParkingTicket() {
		pc = null;
		fine = 0.0;
		po = null;
	}

	public ParkingTicket(ParkedCar pc, ParkingMeter pm, PoliceOfficer po) {
		this.pc = new ParkedCar(pc);
		this.po = new PoliceOfficer(po);
		this.pm = new ParkingMeter(pm);

	}

	/**
	 * @return the pc
	 */
	public ParkedCar getPc() {
		return pc;
	}

	/**
	 * @param pc the pc to set
	 */
	public void setPc(ParkedCar pc) {
		this.pc = pc;
	}

	/**
	 * @return the fine
	 */
	public double getFine() {
		return fine;
	}

	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) {
		this.fine = fine;
	}

	/**
	 * @return the po
	 */
	public PoliceOfficer getPo() {
		return po;
	}

	/**
	 * @param po the po to set
	 */
	public void setPo(PoliceOfficer po) {
		this.po = po;
	}

	public void issueTicket(ParkedCar pc, ParkingMeter pm, PoliceOfficer po) {

		ParkingTicket pt = new ParkingTicket();
		int timeExpired = 
			pc.getNumberOfMinutesParked() - pm.getMinutesOfTimePurchased();
		if(timeExpired <= 0) 	
			pt.setFine(25.00);
		else if(timeExpired > 60) {
			pt.setFine(((timeExpired / 60) * 10) + 25.0); 
		}
		System.out.println("Time expired: " + timeExpired
				+  "\nAmount of fine due: $" + String.format("%,.2f", pt.getFine()));

		pt.setPc(pc);
		pt.setPo(po);
																											
	}
}