package ch8java6thedition;
import java.util.Random;
/**
 * This is the DieRoller class. It accepts an integer argument
 * to determine the number of sides the die has. 
 * 
 * 	--------------------------------
 * 	|	    DieRoller	       |
 * 	|------------------------------|
 * 	| - sides:int		       |
 * 	| - value:int		       |
 * 	|------------------------------|
 * 	| + Die(numSides:int)	       |
 * 	| + roll():void 	       |
 * 	| + getSides():int	       |
 * 	| + getValue():int	       |
 * 	--------------------------------
 * 
 * @author craig
 */
public class DieRoller {
	// Fields	
	private int num_sides;
	private int face_value;
	private Random randy = new Random();
	private Random randy2 = new Random();

	/**
	 * The constructor performs an initial roll of the die.
	 * So this is the first time I've seen a method call 
	 * inside another method or constructor. 
	 * @param sides The number of sides on the die.
	 */
	public DieRoller (int sides) {
		num_sides = sides;
	}

	/**
	 * The roll method simulates the rolling of the die.
	 * @return The value of the dice roll.
	 */
	public int roll() {
		// Create an object of the Random class
		face_value = randy.nextInt(num_sides) + 1;

		return face_value;
	}

	/**
	 * The getSides method returns the number of sides
	 * of the die.
	 * @return The number of sides on the die.
	 */
	public int getSides() {
		return num_sides;
	}

	/**
	 * The getValue method.
	 * @return The value of the side that lands facing up.
	 */
	public int getValue() {
		return face_value;
	}
}
