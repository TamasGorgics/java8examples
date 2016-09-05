/**
 * This example's original source is 
 * https://github.com/winterbe/java8-tutorial#method-and-constructor-references
 */
package java8examples.methodreferences;

/**
 * Contructor reference
 */
public class MethodReferences4 {
	
	public static void main(String... args) {
		
		VehicleFactory<Vehicle> vehicleFactory = Vehicle::new;
		Vehicle vehicle = vehicleFactory.make(4);
	}
}

class Vehicle {
	
	private int numberOfWheels;
	
	Vehicle() {};
	
	Vehicle(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
		System.out.println("Vehicle constructor invoked, number of wheels: " + numberOfWheels);
	}
}

interface VehicleFactory<V extends Vehicle> {
	
	V make(int numberOfWheels);
}
