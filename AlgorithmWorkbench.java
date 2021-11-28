package ch8java6thedition;

/**
 * These are the algorithm workbench problems at the end of
 * chapter 8.
 * 
 * @author craig
 * 2-1-21
 * 12:23pm
 * Finished at 1:39pm. Gotta go pick up Sean from school soon!
 */
public class AlgorithmWorkbench {
	public static void main(String[]args) {
		/**
		 * 1. Consider the following class declaration:
		 * 
		 * 	public class Circle {
		 * 		private double radius;
		 * 		
		 * 		public Circle(double r) {
		 * 			radius = r;
		 * 		}
		 * 
		 * 		public double getArea() {
		 * 			return Math.PI * radius * radius;
		 * 		}
		 * 
		 * 		public double getRadius() {
		 * 			return radius;
		 * 		}
		 * 	}
		 * 
		 * a. Write a toString method for this class. The method should 
		 *    return a String containing the radius and area of the circle.
		 * b. Write an equals method for this class. The method should 
		 *    accept a Circle object as an argument. It should return 
		 *    true if the argument object contains the same data as the 
		 *    calling object, false otherwise.
		 * c. Write a greaterThan method for this class. The method 
		 *    should accept a Circle object as an argument. It should 
		 *    return true if the argument object has a greater area than
		 *    the area of the calling object, false otherwise.
		 * 
		 * 2. Consider the following class declaration:
		 * 	
		 * 	public class Thing {
		 * 		private int x;
		 * 		private int y; 
		 * 		private static int z = 0;
		 * 
		 * 		public Thing() {
		 * 			x = z;
		 * 			y = z;
		 * 		}
		 * 
		 * 		static void putThing(int a) {
		 * 			z = a;
		 * 		}
		 *	}
		 * 
		 *    Assume a program containing the class declaration defines 
		 *    three Thing objects with the following statements:
		 * 
		 * 	Thing one = new Thing();
		 * 	Thing two = new Thing();
		 * 	Thing three = new Thing();
		 * 
		 *    a. How many separate instances of the 'x' member exist?
		 *    b. How many separate instances of the 'y' member exist?
		 *    c. How many separate instances of the 'z' member exist?
		 *    d. What value will be stored in the 'x' and 'y' members
		 *       of each object?
		 *    e. Write a statement that will call the putThing method.
		 * 
		 * answer: see below
		 * 
		 * 3. A pet store sells dogs, cats, birds, and hamsters. Write a 
		 *    declaration for an enumerated data type that can represent
		 *    the types of pets the store sells.
		 * 
		 * answer: 
		 * 	
		 * 	enum Pets { DOGS, CATS, BIRDS, HAMSTERS }
		 */

		// Code for number 2
		Circle myCircle = new Circle(5.0);
		Circle myCircle2 = new Circle(6.0);

		System.out.println(myCircle.toString());
		System.out.println(myCircle.greaterThan(myCircle2));
		System.out.println(myCircle.equals(myCircle2));

		// Code for number 3
		Thing one = new Thing();
		Thing two = new Thing();
		Thing three = new Thing();

		// There are three instances of the 'x' and 'y' member variables
		// and they should be initialized to 0 by default.
		System.out.println("One's x = " + one.getX() + ", y = " + one.getY());
		System.out.println("Two's x = " + two.getX() + ", y = " + two.getY());
		System.out.println("Three's x = " + three.getX() + ", y = " + three.getY());

		// Displaying the putThing method with integer argument
		one.putThing(3);
		System.out.println("Calling putThing() on One changed 'z' to " 
			+ one.getZ() + " for all three objects:\n"
			+ "One's z = " + one.getZ()
			+ "\nTwo's z = " + two.getZ()
			+ "\nThree's z = " + three.getZ());
		


	}	

	public static class Circle {
 		private double radius;
 		
 		public Circle(double r) {
 			radius = r;
 		}
 
 		public double getArea() {
 			return Math.PI * radius * radius;
 		}
 
 		public double getRadius() {
 			return radius;
 		}

		public String toString() {
			String str = "Radius: " + getRadius()
				   + "\nArea: " + String.format("%,.2f", getArea());
			return str;
		}

		public boolean equals(Circle c) {
			boolean isEqual;
			if(this.getRadius() == c.getRadius() && 
				this.getArea() == c.getArea()) 
				isEqual = true;
			else
				isEqual = false;

			return isEqual;
		} 

		public boolean greaterThan(Circle c) {
			boolean isGreaterThan;  
			if(this.getArea() > c.getArea()) 
				isGreaterThan = true;
			else
				isGreaterThan = false;

			return isGreaterThan;
		}
 	}

		public static class Thing {
	 		private int x;
	 		private int y; 
	 		private static int z = 0;
	 
	 		public Thing() {
	 			x = z;
	 			y = z;
	 		}
		 
			public int getX() {
				return x;
			}

			public int getY() {
				return y;
			}

			public int getZ() {
				return z;
			}

	 		static void putThing(int a) {
	 			z = a;
	 		}
		}
}
