/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Apr 2018
 * This class is a blueprint for a truck that extends a vehicle
 *
 ****************************************************************************/

public class Truck extends Vehicle {
	
	protected int capacity = 2000; //kg
	
	public Truck() throws Exception {
		//Default constructor
		this("AAAA111", Colours.GREY);
	}
	
	public Truck(String licensePlate, Colours colour) throws Exception {
		//Constructor override
		super(licensePlate, colour);
		numberOfDoors = 2;
		maxSpeed = 100;
	}
	
	public Truck(String licensePlate) throws Exception {
		//Constructor override dor max speed
		super(licensePlate, Vehicle.Colours.BLACK);
		numberOfDoors = 2;
		maxSpeed = 50;
	}
	
	protected int getCapacity() { return capacity; } //Getter
	
	protected String getStatus() {
		//Returns the relevant fields of the class
		return "License plate: " + licensePlate + "\n" + 
				"Colour: " + colour + "\n" +
				"Speed: " + speed + "km/h\n";
	}
}