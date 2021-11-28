package ch8java6thedition;

/**
 * This is Code Listing 8.14, the Course class.
 * 
 * @author craig
 * 1-30-21
 * 7:14am
 */
public class Course {
	private String courseName;
	private Instructor instructor;
	private Text textBook;

	/**
	 * This constructor initializes the course name
	 * , instructor and text title. 
	 */
	public Course(String course, Instructor teacher, Text book) {
		courseName = course;

		// Create a new Instructor object
		instructor = new Instructor(teacher);

		// Create a new Text object
		textBook = new Text(book);
	}

	/**
	 * getName method
	 * @return Return the name of the course
	 */
	public String getName() {
		return courseName;
	}

	/**
	 * getInstructor method 
	 * @return a new Instructor object
	 */
	public Instructor getInstructor() {
		return new Instructor(instructor);
	}

	/**
	 * getText method
	 * @return a new Text object
	 */
	public Text getText() {
		return new Text(textBook);
	}

	/**
	 * toString method 
	 * @return The data as a String 
	 */
	public String toString() {
		String str = "Course: " + courseName
			+ "\nInstructor: " + instructor
			+ "\nText Book: " + textBook;

		return str;
	}
}

