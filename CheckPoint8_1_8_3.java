package ch8java6thedition;

/**
 * This is the first checkpoint, problems 8.1 - 8.3.
 * 
 * @author craig
 * 1-25-21
 * 4:15pm
 * 
 */
public class CheckPoint8_1_8_3 {
	/**
	 * 8.1 What is the difference between a static field and an 
	 * instance field?
	 * 
	 * Answer: A static field is shared among all instances of 
	 * a class, no matter how many are created. A instance field
	 * is only associated with the object it can be referenced from.
	 * 
	 * 8.2 What action is possible with a static method that is not
	 * possible with an instance method? 
	 * 
	 * Answer: A static method can be called directly from the class
	 * itself without being referenced from an instantiated object.
	 * 
	 * 8.3 Describe the limitation of static methods.
	 * 
	 * Answer: The limitation of static methods is that they can not 
	 * refer to non-static members of the class. This means that any 
	 * method called from a static method must also be static. It also
	 * means that if the method uses any of the class's fields, they 
	 * must be static also.
	 * 
	 * 
	 */	
}
