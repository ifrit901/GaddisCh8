package ch8java6thedition;

/**
 * This is chapter 8 review questions and exercises.
 * 
 * @author craig
 * 2-1-21
 * 10:22am
 */
public class Ch8ReviewQuestions {
	/**
	 * 1. This type of method cannot access any non-static member 
	 *    variables in its own class.
	 *    a. instance
	 *    b. void
	 *    c. static
	 *    d. non-static
	 * 
	 * answer: static
	 * 
	 * 2. When an object is passed as an argument to a method, 
	 *    this is actually passed.
	 *    a) a copy of the object
	 *    b) the name of the object
	 *    c) a reference to the object
	 *    d) none of these; you cannot pass an object 
	 * 
	 * answer: a reference to the object
	 * 
	 * 3. If you write this method for a class, Java will automatically call
	 *    it any time you concatenate an object of the class with a string.
	 *    a) toString
	 *    b) plusString
	 *    c) stringConvert
	 *    d) concatString
	 * 
	 * answer: toString
	 * 
	 * 4. Making an instance of one class a field in another class is called____.
	 *    a) nesting
	 *    b) class fielding
	 *    c) aggregation
	 *    d) concatenation
	 * 
	 * answer: aggregation
	 * 
	 * 5. This is the name of a reference variable that is always available
	 *    to an instance method and refers to the object that is calling the 
	 *    method.
	 *    a) callingObject
	 *    b) this
	 *    c) me
	 *    d) instance
	 * 
	 * answer: this
	 * 
	 * 6. This enum method returns the position of an enum constant in the 
	 *    declaration.
	 *    a) position
	 *    b) location
	 *    c) ordinal
	 *    d) toString
	 * 
	 * answer: ordinal
	 * 
	 * 7. Assuming the following declaration exists:
	 * 
	 * 	enum Seasons { SPRING, SUMMER, WINTER, FALL }
	 * 
	 * What is the fully qualified name of the FALL constant?
	 * 
	 * answer: Seasons.FALL
	 * 
	 * 8. You cannot use the fully qualified name of an enum constant
	 *    for this.
	 *    a) a switch expression
	 *    b) a case expression
	 *    c) an argument to a method
	 *    d) all of these
	 * 
	 * answer: all of these
	 * 
	 * 9. The Java Virtual Machine periodically performs this process, 
	 *    which automatically removes unreferenced objects from memory.
	 *    a) memory cleansing
	 *    b) memory allocation
	 *    c) garbage collection
	 *    d) object expungement
	 * 
	 * answer: garbage collection
	 * 
	 * 10. If a class has this method, it is called automatically just 
	 *     before an instance of the class is destroyed by the Java 
	 *     Virtual Machine.
	 *     a) finalize
	 *     b) destroy 
	 *     c) remove 
	 *     d) housekeeper
	 * 
	 * answer: finalize
	 * 
	 * 11. CRC stands for:
	 *     a) Class, Return value, Composition
	 *     b) Class, Responsibilities, Collaborations
	 *     c) Class, Responsibilities, Composition
	 *     d) Compare, Return, Continue
	 * 
	 * answer: Class, Responsibilities, Collaborations
	 * 
	 * // True or False
	 * 12. A static member method may refer to non-static member variables
	 *     of the same class, but only after an instance of the class 
	 *     has been defined.
	 * 
	 * answer: False. A static member method can only refer to static 
	 * 	   member variables.
	 * 
	 * 13. All static member variables are initialized to -1 by default.
	 * 
	 * answer: False. They are initialized to 0 by default.
	 * 
	 * 14. When an object is passed as an argument to a method, the method
	 *     can access the object. 
	 * 
	 * answer: True. A method can access an object that is passed to it.
	 * 
	 * 15. A method cannot return a reference to an object.
	 * 
	 * answer: False. It can.
	 * 
	 * 16. You can declare an enumerated data type inside a method.
	 * 
	 * answer: False. 
	 * 
	 * 17. Enumerated data types are actually special types of classes.
	 * 
	 * answer: True.
	 * 
	 * 18. enum constants have a toString method.
	 * 
	 * answer: True.
	 * 
	 * // Find the error
	 * 1. The following class definition has an error. What is it? 
	 * 
	 * 	public class myClass {
	 * 		private int x;
	 * 		private double y;
	 * 
	 * 		public static void setValues(int a, double b) {
	 * 			x = a;
	 * 			y = b;
	 *		}
	 * 	}
	 * 
	 *    answer: The method setValues is static and cannot operate on
	 *            non-static member variables 'x' and 'y'.
	 * 
	 */	
	private int x;
	private double y;

	public static void main(String[]args) {
		setValues(6,9);
	}

	public static void setValues(int a, double b) {
		// Causes an error ->   x = a;
		// Causes an error ->   y = b;
	}

	/**
	 * 2. Assume the following declaration exists:
	 *  
	 * 	enum Coffee { MEDIUM, DARK, DECAF } 
	 * 
	 *    Find the error(s) in the following switch statement:
	 * 
	 * 	// This code has errors!
	 * 	Coffee myCup = DARK; 
	 * 
	 * 	switch (myCup)
	 * 	{
	 * 		case Coffee.MEDIUM : 
	 * 			System.out.println("Mild flavor.");
	 * 			break;
	 * 		case Coffee.DARK :
	 * 			System.out.println("Strong flavor.");
	 * 			break;
	 * 		case Coffee.DECAF :
	 * 			System.out.println("Won't keep you awake.");
	 * 			break;
	 * 		default : 
	 * 			System.out.println("Never heard of it.");
	 * 
	 * answer: The variable 'myCup' needs to be initialized with the fully
	 *         qualified name of the enumerated constant. The case 
	 *         statements should not have the fully qualified constant name.
	 * 
	 * 
	 */
}
