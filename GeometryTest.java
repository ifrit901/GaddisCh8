package ch8java6thedition;
import javax.swing.JOptionPane;
/**
 * This program tests the Geometry class.
 * 
 * @author craig
 * 2-9-21
 * 11:05am
 */

public class GeometryTest {
	public static void main(String[]args) {
		String input;
		double radius;
		double length;
		double width;
		double base;
		double height;

		input = JOptionPane.showInputDialog(null, "What is the radius "
			+ "of the circle?");
		radius = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the length "
			+ "of the rectangle?");
		length = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the width "
			+ "of the rectangle?");
		width = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the base "
			+ "of the triangle?");
		base = Double.parseDouble(input);

		input = JOptionPane.showInputDialog(null, "What is the height "
			+ "of the triangle?");
		height = Double.parseDouble(input);

		JOptionPane.showMessageDialog(null, "The area of the circle is "
			+ String.format("%,.2f", Geometry.circleArea(radius)));

		JOptionPane.showMessageDialog(null, "The area of the rectangle is "
			+ String.format("%,.2f", Geometry.rectangleArea(length, width)));

		JOptionPane.showMessageDialog(null, "The area of the triangle is "
			+ String.format("%,.2f", Geometry.triangleArea(base, height)));
		

	}	
}
