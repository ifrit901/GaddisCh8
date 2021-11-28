package ch8java6thedition;

/**
 * 9. Geometry Calculator
 * 
 * Design a Geometry class with the following methods:
 * 
 * - A static method that accepts the radius of a circle
 *   and returns the area of the circle. Use the following formula:
 * 
 *   A = PI * r^2
 * 
 *   Use Math.PI for 'pi' and the radius of the circle for 'r'.
 * 
 * - A static method that accepts the length and width of a rectangle
 *   and returns the area of the rectangle. Use the following formula:
 * 
 *   Area = Length x Width
 * 
 * - A static method that accepts the length of a triangle's base
 *   and the triangle's height. The method should return the area
 *   of the triangle. Use the following formula:
 * 
 *   Area = Bass x Height x 0.5
 * 
 * The methods should display an error message if negative values 
 * are used for any of the values entered into the formulas.
 * 
 * Next, write a program to test the class, which displays the 
 * following menu and responds to the user's input:
 * 
 * 	Geometry Calculator
 * 	1. Calculate the area of a circle.
 * 	2. Calculate the area of a rectangle.
 * 	3. Calculate the area of a triangle.
 * 	4. Quit
 * 
 * 	Enter your choice (1 - 4)
 * 
 * Display an error message if a value outside 1 - 4 is chosen from
 * the menu.
 * 
 * @author craig
 */
public class Geometry {

	public static double circleArea(double radius) {
		if(radius < 0) {
			System.out.println("Error. Radius must not be negative.");
		}
		double area;
		area = Math.PI * radius * radius;
		return area;
	}

	public static double rectangleArea(double l, double w) {
		if(l < 0 || w < 0) {
			System.out.println("Error. Length and width must both be"
				+ "zero or above.");
		}
		double area;
		area = l * w;	
		return area; 
	}

	public static double triangleArea(double base, double height) {
		if(base < 0 || height < 0) {
			System.out.println("Error. Both base and height "
				+ "must be positive numbers.");
		}
		double area;
		area = base * height * .5;
		return area;
	}

}