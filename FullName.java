package ch8java6thedition;

/**
 * This is Code Listing 8.16
 * 
 * @author craig
 */
public class FullName {
	/*
	This class is dangerous because it does not
	prevent operations on null reference fields.
	*/
	private String lastName;
	private String firstName;
	private String middleName;

	/**
	 * The setLastName method sets the lastName field.
	 * @param lname The String to set lastName to. 
	 */
	public void setLastName(String lname) {
		lastName = lname;
	}

	/**
	 * The setFirstName method sets the firstName field.
	 * @param fname The String to set firstName to.
	 */
	public void setFirstName(String fname) {
		firstName = fname;
	}

	/**
	 * The setMiddleName method sets the middleName field.
	 * @param mname The String to set middleName to.
	 */
	public void setMiddleName(String mname) {
		middleName = mname;
	}

	/**
	 * The getLength method returns the length of the full name.
	 * @return The length of the full name.
	 */
	public int getLength() {
		int length = firstName.length() + middleName.length() + lastName.length();
		return length;
	}	

	/**
	 * The toString method returns the full name in String form.
	 * @return The full name as a String.
	 */
	@Override
	public String toString() {
		String str = firstName + " " + middleName + " " + lastName;
		return str;
	}
}
