package ch8java6thedition;

/**
 * This is Code Listing 8.13, the TextBook class (Text).
 * 
 * @author craig
 * 1-30-21
 * 6:51am
 */
public class Text {
	/*
	The Text class stores information about a text book.
	*/	
	private String title;
	private String author;
	private String publisher;

	/**
	 * This constructor initializes all the fields.
	 * @param textTitle The title of the text
	 * @param auth The text's author
	 * @param pub The text's publisher
	 */
	public Text(String textTitle, String auth, String pub) {
		title = textTitle;
		author = auth;
		publisher = pub;
	}

	/**
	 * copy constructor
	 * Creates a second Text object with equivalent fields
	 * @param object2 The Text object to copy
	 */
	public Text(Text object2) {
		title = object2.title;
		author = object2.author;
		publisher = object2.publisher;
	}

	/**
	 * set method
	 * Sets all the fields
	 * @param textTitle The title of the text
	 * @param auth The text's author
	 * @param pub The text's publisher
	 */
	public void set(String textTitle, String auth, String pub) {
		title = textTitle; 
		author = auth;
		publisher = pub;
	}

	/**
	 * toString method
	 * Returns the field data as a String
	 * @return The data String
	 */
	@Override
	public String toString() {
		// Create a String representing the object
		String str = "Title: " + title 
			+ "\nAuthor: " + author
			+ "\nPublisher: " + author;

		return str;
	}
}
