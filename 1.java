package Week3;
class Vehicle {
public  void displayVehicleType() {
	System.out.println("The vehicle is ");
	}
public  void start() {
	System.out.println("The vehicle was  Started");
}
}
class Car extends Vehicle{
	@Override
	public  void displayVehicleType() {
		System.out.println("Car");
		}
	@Override 
	public void start() {
		System.out.println("The Car was  Started");
	}
}
class Bike extends Vehicle{
	@Override
	public  void displayVehicleType() {
		System.out.println("Bike");
		}
	@Override 
	public void start() {
		System.out.println("The Bike was  Started");
	}
}
public class Main{
	public static void main(String[] args) {
		Vehicle vch=new Vehicle();
		Vehicle car=new Car();
		Vehicle bike=new Bike();
		vch.displayVehicleType();
		vch.start();
		car.displayVehicleType();
		car.start();
		bike.displayVehicleType();
		bike.start();
	}
}