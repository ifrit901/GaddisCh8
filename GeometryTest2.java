package ch8java6thedition;
import java.util.Scanner;
/**
 * This is a demonstration of the Geometry class with the 
 * correct assignment, a switch case menu.
 * 
 * @author craig
 * 2-9-21
 * 11:58am 
 */

public class GeometryTest2 {
	public static void main(String [] args) {
		String answer = "y";
		int choice;

		Scanner input = new Scanner(System.in);

		while(answer.equalsIgnoreCase("y")) {
			System.out.println("Geometry Calculator"
				+ "\n1. Calculate the Area of a Circle"
				+ "\n2. Calculate the Area of a Rectangle"
				+ "\n3. Calculate the Area of a Triangle"
				+ "\n4. Quit"
				+ "\n\nEnter your choice (1-4):");

			choice = input.nextInt();	

			while(choice < 1 || choice > 4) {
				System.out.println("You must choose between 1-4");
				choice = input.nextInt();
			}

			switch(choice) 
			{
				case 1 :
				{
					double radius;
					System.out.println("Enter the radius of the circle.");
					radius = input.nextDouble();
					System.out.println("The area of the circle is "
						+  String.format("%,.2f", Geometry.circleArea(radius)));
					break;
				}

				case 2 :
				{
					double length, width;
					System.out.println("Enter the length of the rectangle.");
					length = input.nextDouble();
					System.out.println("Enter the width of the rectangle.");
					width = input.nextDouble();
					System.out.println("The area of the rectangle is "
						+ String.format("%,.2f", Geometry.rectangleArea(length, width)));
					break;
				}

				case 3 : 
				{
					double base, height;
					System.out.println("Enter the base of the triangle.");
					base = input.nextDouble();
					System.out.println("Enter the height of the triangle.");
					height = input.nextDouble();
					System.out.println("The area of the triangle is "
						+ String.format("%,.2f", Geometry.triangleArea(base, height)));
					break;
				}

				case 4 :
				{
					System.out.println("Thanks for your participation!");
					break;
				}
			}

			input.nextLine();
			System.out.println("Do you wanna keep calculating?");
			answer = input.nextLine();
		}

		System.out.println("Thanks for your participation!");
	}	
}
