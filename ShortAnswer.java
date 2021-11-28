package ch8java6thedition;

/**
 * This is the short answer section of the chapter 8
 * review qwestions.
 * 
 * @author craig
 * 2-1-21
 * 8:17pm
 */
public class ShortAnswer {
	/**
	 * 1. Describe one thing you cannot do with a static method.
	 * 
	 * answer: You cannot use it to operate on non-static member
	 *         variables.
	 * 
	 * 2. Why are static methods useful in creating utility classes?
	 * 
	 * answer: Static methods are good for utility classes because 
	 *  	   they can operate on data while having no use for storing
	 * 	   data. 
	 * 
	 * 3. Describe the difference in the way variables and class objects
	 *    are passed as arguments to a method.
	 * 
	 * answer: Variables are passed by value and the original variable's 
	 *         value is not changed. Objects are passed by reference and
	 * 	   the contents of the object can be changed by the method's
	 * 	   actions.
	 * 
	 * 4. Even if you do not write an equals method for a class, Java 
	 *    provides one. Describe the behavior of the equals method 
	 *    that Java automatically provides. 
	 * 
	 * answer: The default equals method just compares the reference 
	 *  	   variables of the objects, not the values contained within
	 * 	   the objects.
	 * 
	 * 5. A "has a" relationship can exist between classes. What does 
	 *    this mean?
	 * 
	 * answer: A class can describe an object that is a member of another
	 * 	   class. Like a Wheel class can be a member of a Car class. 
	 * 
	 * 6. What happens if you attempt to call a method using a reference 
	 *    variable that is set to null?
	 * 
	 * answer: The program will crash and you'll get a "null pointer exception"
	 *  	   error. 
	 * 
	 * 7. Is it advisable or not advisable to write a method that returns a 
	 *    reference to an object that is a private field? What is the 
	 *    exception to this?
	 * 
	 * answer: It is not advisable as it creates security holes. Returning
	 * 	   a reference to an object is a "shallow copy" of the object
	 * 	   and leaves it open to being changed by variables/methods
	 *   	   outside the object. "Deep copies" should be used instead, 
	 * 	   which are copies of the referenced objects. 
	 * 	   
	 * 	   The exception to this is String objects. They're ok because
	 * 	   Strings are immutable in Java and cannot be messed with.
	 * 
	 * 8. What is the 'this' keyword?
	 * 
	 * answer: The 'this' keyword lets you refer to the calling object
	 * 	   without shadowing an identical parameter variable. It 
	 * 	   helps eliminate the need for coming up with different 
	 * 	   variable names when it isn't necessary.
	 * 
	 * 9. Look at the following declaration:
	 * 	
	 * 	enum Color { RED, ORANGE, GREEN, BLUE }
	 * 
	 *    a. What is the name of the data type declared by this statement?
	 *    b. What are the enum constants for this type?
	 *    c. Write a statement that defines a variable of this type and
	 *       initializes it with a valid value.
	 * 
	 * answers: a. Color
	 * 	    b. RED, ORANGE, GREEN, BLUE
	 * 	    c. Color surface = Color.RED;
	 * 
	 * 10. Assuming the following enum declaration exists:
	 * 
	 * 	enum Dog { POODLE, BOXER, TERRIER }
	 * 
	 *     What will the following statements display?
	 *     a. System.out.println(Dog.POODLE + "\n" +
	 * 			     Dog.BOXER + "\n" + 
	 * 			     Dog.TERRIER);
	 *     b. System.out.println(Dog.POODLE.ordinal() + "\n" +
	 * 			     Dog.BOXER.ordinal() + "\n" +
	 * 			     Dog.TERRIER.ordinal());
	 *     c. Dog myDog = Dog.BOXER;
	 * 	  if (myDog.compareTo(Dog.TERRIER) > 0) 
	 * 		System.out.println(myDog + " is greater than " + Dog.TERRIER);
	 * 	  else
	 * 		System.out.println(myDog + " is not greater than " + Dog.TERRIER);
	 * 
	 * answers: a. POODLE
	 * 	       BOXER
	 * 	       TERRIER
	 * 	    b. 0
	 * 	       1
	 * 	       2
	 * 	    c. BOXER is not greater than TERRIER
	 * 
	 * 11. Under what circumstances does an object become a candidate for
	 *     garbage collection?
	 * 
	 * answer: When the object ceases to be referenced, it becomes a 
	 * 	   candidate for garbage collection.
	 * 
	 */	
}
