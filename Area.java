package ch8java6thedition;

/**
 * This is programming challenge #1.
 * 
 * 1. Area class
 * 
 * Write a class that has three overloaded static methods for calculating
 * the areas of the following geometric shapes:
 * 
 * - Circles
 * - Rectangles
 * - Cylinders
 * 
 * Here are the formulas for calculating the areas of the shapes:
 * 
 * 	Area of a Circle: 	Area = PI * r^2
 * 		   where: 	PI is Math.PI and r is the circle's radius
 * 	Area of a Rectangle:	Area = width * length
 * 	Area of a Cylinder:	Area = PI * r^2 * h
 * 		   where: 	PI is Math.PI, r is the radius of the cylinder's
 * 				base, and h is the cylinder's height
 * 
 * Because the methods are to be overloaded, they should each have the same
 * name, but different parameter lists. Demonstrate the class in a complete 
 * program.
 * 
 * @author craig
 * 
 */
public class Area {

	public static double area(double r) {
		return Math.PI * r * r;
	}	

	public static double area(double w, double l) {
		return l * w;
	}

	public static double area(double pi, double r, double h) {
		return pi * (r * r) * h;
	}
}
