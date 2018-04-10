/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Apr 2018
 * This program tests the vehicle subclasses
 *
 ****************************************************************************/

public class Main {
	
	public static void main(String[] args) throws Exception {
		//Try to instantiate a vehicles to see if it is possible
		
		System.out.println("Try to instansiate a bike");
		Vehicle bike = new Bike();
		
		System.out.println("Try to instansiate a truck");
		Vehicle truck = new Truck();
		
		System.out.println("Try to instansiate a vehicle");
		Vehicle vehicle = new Vehicle();
	}
}