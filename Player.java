package ch8java6thedition;

/**
 * This is the Player class. 
 * 
 * @author craig
 */
public class Player {
	private int points;	

	public Player() {
		this.points = 50;
	}

	public void incrementPoints(DieRoller dr) {
		this.points += dr.getValue();
	}

	public void decrementPoints(DieRoller dr) {
		this.points -= dr.getValue();
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
