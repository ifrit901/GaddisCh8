package ch8java6thedition;

/**
 * This is the player class for the coin game (#12).
 * 
 * @author craig
 * 2-12-21
 * 6:42am
 * 
 */
public class CoinPlayer {
	private int points;

	// Constructor creates object with set 
	// number of points
	public CoinPlayer(int points) {
		this.points = points;
	}

	/**
	 * The getPoints method 
	 * @return The number of points the player has
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * The setPoints method accepts a value to set 
	 * the player points to.
	 * @param points 
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/** 
	 * The incrementPoints method adds one
	 * to player points.
	 * @param points 
	 */
	public void incrementPoints() {
		points++;
	}

	/** 
	 * The decrementPoints method subtracts
	 * one from player points.
	 * @param points 
	 */
	public void decrementPoints() {
		points--;
	}
}
