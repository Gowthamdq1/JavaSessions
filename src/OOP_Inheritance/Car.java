package OOP_Inheritance;

public class Car extends Vehicle {
	
	public void start() {
		System.out.println("Car---Start");
	}
	public void stop() {
		System.out.println("Car---Stop");
	}
	public void reFuel() {
		System.out.println("Car---reFuel");
	}
	public static void billing() {
		System.out.println("Car --Billing");
	}
	public static final void display() {
		System.out.println("Car -- display");
	}
	public final void running() {
		System.out.println("Car -- running");
	}
	public void payment (String cc, int cvv) {
		System.out.println("car payment using : "+cc + " "+cvv);
	}
	public void payment (String upi) {
		System.out.println("car payment using : "+upi);
	}
	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}

}
