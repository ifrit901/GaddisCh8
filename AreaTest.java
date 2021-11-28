package ch8java6thedition;
 
/**
 * This program tests the Area class.
 * 
 * @author craig
 * 2-2-21
 * 11:01am
 */
public class AreaTest {
	final static double PI = Math.PI;

	public static void main(String [] args) {
		System.out.println("The area of a circle with radius 6.5 is: " 
			   + String.format("%,.2f", Area.area(6.5)));

		System.out.println("The area of a rectangle with length 6.5 and"
			+ " width 9.2 is : " + String.format("%,.2f", Area.area(6.5, 9.2)));

		System.out.println("The area of a cylinder with radius 6.5 and "
			+ "height 7.3 is : " + String.format("%,.2f", Area.area(PI, 6.5, 7.3)));
	}
}
