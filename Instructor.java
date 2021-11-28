package ch8java6thedition;

/**
 * This is Code Listing 8.12, the Instructor class.
 * 
 * @author craig
 * 1-30-21
 * 5:32am
 */
public class Instructor {
	/*
	This class stores information about the instructor.
	*/	
	private String lastName;
	private String firstName;
	private String officeNumber;

	/**
	 * The constructor initializes the object with all 
	 * of the fields.
	 * @param lname The last name of the instructor
	 * @param fname The first name of the instructor
	 * @param officeNum The office number of the instructor
	 */
	public Instructor(String lname, String fname, String officeNum) {
		lastName = lname;
		firstName = fname;
		officeNumber = officeNum;
	}

	/**
	 * The copy constructor accepts an initialized Instructor
	 * object and creates a new object with identical fields.
	 * @param object2 
	 */
	public Instructor(Instructor object2) {
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
	}

	/**
	 * setLastName method
	 * Sets the last name.
	 * @param lname 
	 */
	public void setLastName(String lname) {
		lastName = lname;
	}

	/**
	 * setFirstName method
	 * Sets the first name.
	 * @param fname
	 */
	public void setFirstName(String fname) {
		firstName = fname;
	}

	/**
	 * setOfficeNumber method
	 * Sets the instructor's office number.
	 * @param officeNum
	 */
	public void setOfficNumber(String officeNum) {
		officeNumber = officeNum;
	}

	/**
	 * set method
	 * Sets all the fields at once.
	 * @param lname The instructor's last name
	 * @param fname The instructor's first name
	 * @param officeNum The instructor's office number
	 */
	public void set(String lname, String fname, String officeNum) {
		lastName = lname;
		firstName = fname;
		officeNumber = officeNum;
	}

	/**
	 * toString method
	 * Displays the data in String form
	 * @return The data as a String 
	 */
	public String toString() {
		String str = "Last name: " + lastName
			   + "\nFirst name: " + firstName
			   + "\nOffice number: " + officeNumber;

		return str;
	}
	
}
