package ch8java6thedition;

/**
 * This is Check Point 8.5 - 8.7.
 * 
 * @author craig
 * 2-1-21
 * 8:42am
 */
public class CheckPoint8_5 {

		enum Flower { ROSE, DAISY, PETUNIA }
		enum Creatures { HOBBIT, ELF, DRAGON }
		enum Letters { Z, X, Y }

	public static void main(String [] args) {
		/**
		 * 8.5 Look at the following statement, which declares an 
		 * enumerated data type:
		 * 	enum Flower { ROSE, DAISY, PETUNIA} 
		 * a) What is the name of the data type?
		 * 	answer: Flower
		 * b) What is the ordinal value for the enum constant ROSE?
		 *    For DAISY? For PETUNIA?
		 *	answers: 0, 1, 2. 	
		 * c) What is the fully qualified name of the enum constant ROSE?
		 *    Of DAISY? Of PETUNIA?
		 * 	answers: Flower.ROSE, Flower.DAISY, Flower.PETUNIA
		 * d) Write a statement that declares a variable of this 
		 *    enumerated data type. The variable should be named 'flora'.
		 *    Initialize the variable with the PETUNIA constant.
		 * 	answer: see below.
		 * 
		 * 8.6 Assume that the following enumerated data type has been 
		 * declared: 
		 * 
		 * 	enum Creatures { HOBBIT, ELF, DRAGON }
		 * 
		 * What will the following code display?
		 *	System.out.println(Creatures.HOBBIT + " " 
		 * 			 + Creatures.ELF + " "
		 * 			 + Creatures.DRAGON);
		 * 
		 * 8.7 Assume that the following enumerated data type has 
		 * been declared:
		 * 	
		 * 	enum Letters { Z, Y, X }
		 * 
		 * What will the following code display?
		 * 	
		 * 	if(Letters.Z.compareTo(Letters.X) > 0)
		 * 		System.out.println("Z is greater than X.");
		 * 	else
		 * 		System.out.println("Z is not greater than X.");
		 */

		// 8.5
		Flower flora = Flower.PETUNIA;
		System.out.println(flora);

		// 8.6
		System.out.println(Creatures.HOBBIT + " "
				+  Creatures.ELF + " "
				+  Creatures.DRAGON);

		// 8.7 
		if(Letters.Z.compareTo(Letters.X) > 0)
			System.out.println("Z is greater than X.");
		else
			System.out.println("Z is not greater than X.");
	}	
}
