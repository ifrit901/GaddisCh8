package ch8java6thedition;

/**
 * This program tests the Month class.
 * 
 * @author craig
 * 2-4-21
 * 7:34am
 */
public class MonthTest {
	public static void main(String [] args) {
		int monthNum;
		String monthName;

		// Month objects initialized to January(m2) and February(m2)
		Month m1 = new Month(1);
		Month m2 = new Month(2);

		System.out.println(m1);
		System.out.println(m2);

		System.out.println("Is " + m1.getMonthName() + " = " + m2.getMonthName()
			+ "? " + m1.equals(m2));
		System.out.println("Is " + m1.getMonthName() + " greater than " 
			+ m2.getMonthName() + "? " + m1.greaterThan(m2));

		System.out.println("Is " + m1.getMonthName() + " less than " 
			+ m2.getMonthName() + "? " + m1.lessThan(m2));

		System.out.println("What is " + m1.toString() + "'s number? " 
			+ m1.getMonthNumber());

		// January(m1) changed to June
		monthNum = 6;
		m1.setMonthNumber(monthNum);

		System.out.println("Is " + m1.getMonthName() + " = " + m2.getMonthName()
			+ "? " + m1.equals(m2));
		System.out.println("Is " + m1.getMonthName() + " greater than " 
			+ m2.getMonthName() + "? " + m1.greaterThan(m2));

		System.out.println("Is " + m1.getMonthName() + " less than " 
			+ m2.getMonthName() + "? " + m1.lessThan(m2));

		System.out.println("What is " + m1.toString() + "'s number? " 
			+ m1.getMonthNumber());


		// New Month object created with String arg constructor
		monthName = "December";
		Month m3 = new Month(monthName);

		System.out.println("Is " + m3.getMonthName() + " = " + m2.getMonthName()
			+ "? " + m3.equals(m2));
		System.out.println("Is " + m3.getMonthName() + " greater than " 
			+ m2.getMonthName() + "? " + m3.greaterThan(m2));

		System.out.println("Is " + m3.getMonthName() + " less than " 
			+ m2.getMonthName() + "? " + m3.lessThan(m2));

		System.out.println("What is " + m3.toString() + "'s number? " 
			+ m3.getMonthNumber());

		monthName = "February";
		Month m4 = new Month(monthName);

		System.out.println("Is " + m4.getMonthName() + " = " + m2.getMonthName()
			+ "? " + m4.equals(m2));
		System.out.println("Is " + m4.getMonthName() + " greater than " 
			+ m2.getMonthName() + "? " + m4.greaterThan(m2));

		System.out.println("Is " + m4.getMonthName() + " less than " 
			+ m2.getMonthName() + "? " + m4.lessThan(m2));

		System.out.println("What is " + m4.toString() + "'s number? " 
			+ m4.getMonthNumber());
	}	
}
