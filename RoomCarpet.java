package ch8java6thedition;

/**
 * The RoomCarpet class.
 * 
 * @author craig
 * 2-3-21
 * 6:44am
 */
public class RoomCarpet {
	private RoomDimension rd;
	private double costPerSquareFoot;

	public RoomCarpet(RoomDimension rd, double cost) {
		this.rd = new RoomDimension(rd);
		costPerSquareFoot = cost;
	}
	
	public void setRoomDimension(RoomDimension rd) {
		this.rd = new RoomDimension(rd);
	}

	public void setCost(double cost) {
		costPerSquareFoot = cost;
	}

	public RoomDimension getRoomDimension() {
		return new RoomDimension(rd);
	}

	public double getCost() {
		return costPerSquareFoot * rd.getArea();
	}

	public String toString() {
		String str = "A room with an area of " + rd.getArea() 
			+ " square feet will cost " 
			+ String.format("$%,.2f", getCost());
		return str;
	}
}
