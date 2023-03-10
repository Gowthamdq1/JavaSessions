package OOP_Inheritance;

public class BMW extends Car{
	
	//@Override
	public void start() {
		System.out.println("BMW--Start");
		
	}
	public void autoParking() {
		System.out.println("BMW--Auto Parking");
	}
	
	public static void billing() {
		System.out.println("BMW -- billing");

	}
//	public static final void display() {//CANNOT OVERRIDE THE FINAL METHOD FROM CAR
//		System.out.println("BMW -- display");
//	}
	
//	public final void running() {//CANNOT OVERRIDE THE FINAL METHOD FROM CAR
//		System.out.println("Car -- running");
//	}
	//The below two methods are overloaded and overrided 
	@Override
	public void payment (String cc, int cvv) {
		System.out.println("car payment using : "+cc + " "+cvv);
	}
	@Override
	public void payment (String upi) {
		System.out.println("car payment using : "+upi);
	}

	//we are overriding the vehicle method from grand parent class
//	@Override 
//	public void engine() {
//		System.out.println("BMW -- engine");
//	}

	public void petrolEngine() {
		System.out.println("BMW -- Petrol Engine");
	}
}
