package ch8java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge #3. 
 * 
 * 3. Carpet Calculator
 * 
 * The WestField Carpet Company has asked you to write an application
 * that calculates the price of carpeting rectangular rooms. To calculate
 * the price, you multiply the area of the floor (width x length) by the
 * price per square foot of carpet. For example, the area of floor that is 
 * 12 feet long and 10 feet wide is 120 square feet. To cover that floor 
 * with carpet that costs $8 per square foot would cost $960. 
 * 
 * First, you should create a class called RoomDimension that has two 
 * fields: one for the length of the room and one for the width. The 
 * room dimension class should have a method that returns the area of 
 * the room. 
 * 
 * Next you should create a RoomCarpet class that has a RoomDimension
 * object as a field. It should also have a field for the cost of the 
 * carpet per square foot. The RoomCarpet class should have a method 
 * that returns the total price of the carpet.
 * 
 * Figure 8 - 21 is a UML diagram that shows possible class designs and 
 * the relationships among the classes. Once you have written these classes,
 * use them in an application that asks the user to enter the dimensions 
 * of a room and the price per square foot of the desired carpet. 
 * 
 * 
 * @author craig
 */
public class CarpetCalculator {
	public static void main(String[]args) {
		double carpetCost;
		double length;
		double width;

		Scanner input = new Scanner(System.in);

		System.out.println("What is the cost per square foot of the carpet"
			+ "\nThat you want?");
		carpetCost = input.nextDouble(); 

		System.out.println("What is the length of the room to be carpeted?");
		length = input.nextDouble();

		System.out.println("What is the width of the room to be carpeted?");
		width = input.nextDouble();

		RoomDimension rd = new RoomDimension(length, width);
		RoomCarpet rc = new RoomCarpet(rd, carpetCost);

		System.out.println("The cost of carpeting a room " + rd.getWidth() 
			+ " feet wide and " + rd.getLength() + "\n"
			+ "feet long is $" + String.format("%,.2f", rc.getCost()));
	}	
}
