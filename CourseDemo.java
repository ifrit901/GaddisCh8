package ch8java6thedition;

/**
 * This is Code Listing 8.15, CourseDemo.
 * 
 * @author craig
 * 1-30-21
 * 8:01am
 */
public class CourseDemo {
	public static void main(String[]args) {
		// Create an Instructor object
		Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");

		// Create a Text object
		Text myText = new Text("Starting Out with Java", "Gaddis", "Pearson");

		// Create a Course object
		Course myCourse = new Course("Intro to Java", myInstructor, myText);

		// Display the Course information
		System.out.println(myCourse);
	}	
}
