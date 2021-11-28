package ch8java6thedition;

/**
 * 8. Parking Ticket Simulator
 * 
 * For this assignment you will design a set of classes that 
 * work together to simulate a police officer issuing a 
 * parking ticket. You should design the following classes:
 * 
 * - The ParkedCar class: This class should simulate a parked 
 *   car. The class's responsibilities area as follows:
 * 	- To know the car's make, model, license number and 
 *  	  the number of minutes the car has been parked.
 * - The ParkingMeter class: This class should simulate a 
 *   parking meter. The class's only responsibility is as follows:
 * 	- To know the number of minutes of parking time that 
 * 	  has been purchased.
 * - The ParkingTicket class: This class should simulate a parking
 *   ticket. The class's responsibilities are as follows:
 * 	- To report the make, model, and license number of the 
 * 	  illegally parked car. 
 * 	- To report the amount of the fine, which is $25 for the 
 * 	  first hour or part of an hour that the car is illegally 
 * 	  parked, plus $10 for every additional hour or part of 
 * 	  an hour that the car is illegally parked. 
 * 	- To report the name and badge number of the police officer
 * 	  who is issuing the ticket.
 * -PoliceOfficer class: This class should simulate a police 
 *  officer inspecting parked cars. The class's responsibilities 
 *  are as follows:
 * 	- To know the police officer's name and badge number.
 * 	- To examine a ParkedCar object and a ParkingMeter object,
 * 	  and determine whether the car's time has expired.  
 * 	- To issue a parking ticket(generate a ParkingTicket object) 
 * 	  if the car's time has expired. 
 * 
 * Write a program that demonstrates how these classes collaborate.
 * 
 * @author craig
 * 2-8-21
 * 11:28am
 */
public class ParkingTicketTest {
	public static void main(String [] args) {
		/*
		I have no idea how to organize these classes. Idk which 
		class takes precedence or if they are all equalish.
		I won't be taking user input for the cop's name and 
		information like that, just gonna create some objects.
		I suppose there needs to be at least one of each object.
		The one parked car will need to have a parking meter 
		object with an expired time to trigger a ticket being 
		written by the police person. I've been trying to use
		copy constructors in the aggregated object fields. I'm
		assuming I should get in the habbit of doing that lest I
		make shallow copies of the objects.
		*/

		ParkingMeter pm = new ParkingMeter(60);		
		ParkedCar pc = new ParkedCar("Honda", "Civic", "A43 G5H4", 265);
		PoliceOfficer po = new PoliceOfficer("Judge Dredd", "123456");

		po.examineParkedCar(pc, pm, po);
	}		
}
