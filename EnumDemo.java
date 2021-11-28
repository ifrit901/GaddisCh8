package ch8java6thedition;

/**
 * This is Code Listing 8.18, EnumDemo.
 * 
 * @author craig
 * 1-30-21
 * 1:05pm
 */
public class EnumDemo {
	// Declare the enumerated type
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
		   FRIDAY, SATURDAY }
	public static void main(String[]args) {
		Day workday = Day.WEDNESDAY;

		// The following statement displays WEDNESDAY
		System.out.println(workday);

		// The following statement displays the ordinal 
		// value for Day.SUNDAY which is 0.
		System.out.println("The ordinal value for " + Day.SUNDAY + 
			" is " + Day.SUNDAY.ordinal());

		// The following statement displays the ordinal
		// value for Day.SATURDAY, which is 6.
		System.out.println("The ordinal value for " + Day.SATURDAY + 
			" is " + Day.SATURDAY.ordinal());

		// The following statement compares two enum objects
		if(Day.FRIDAY.compareTo(Day.MONDAY) > 0) 
			System.out.println(Day.FRIDAY + " is greater than " 
			+ Day.MONDAY);
		else
			System.out.println(Day.FRIDAY+ " is not greater than " 
				+ Day.MONDAY);
	}
} 