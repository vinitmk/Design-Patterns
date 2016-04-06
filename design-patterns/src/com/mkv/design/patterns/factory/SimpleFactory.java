/*	A simple factory (or factory) is a tool whose job is to create/instansiate objects,
 * 	and is neither a factory method pattern (we’ll see this pattern after),
 * 	nor an abstract factory pattern (same comment).
 * 
 * 	No real implementation in Java as static factory method is preferred over this approach.
*/
package com.mkv.design.patterns.factory;

public class SimpleFactory {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Drivable car1 = factory.getCarInstance(Car.FERRARI);
		Drivable car2 = factory.getCarInstance(Car.MUSTANG);
		
		System.out.println(car1);
		System.out.println(car2);
	}

}

class Mustang implements Drivable{

	@Override
	public void drive() {
		System.out.println("Mustang Accelerating");
		
	}
	
}

class Ferrari implements Drivable{

	@Override
	public void drive() {
		System.out.println("Mustang Accelerating");		
	}
	
}

class CarFactory{
	
	public Drivable getCarInstance(Car car){
		switch(car){
			case FERRARI: return new Ferrari();
			case MUSTANG: return new Mustang();
			default: return null;
		}
	} 
}

enum Car{
	FERRARI,
	MUSTANG
}