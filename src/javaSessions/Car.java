package javaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels=4;
	
	public void start() {
		System.out.println("start");
	}
	
	public static void carSpeedTest() {
		System.out.println("Car Speed Test");
	}

	public static void main(String[] args) {
		
		Car c1= new Car();
		c1.name="BMW";
		c1.price=90;
		c1.color="Black";
		
		Car c2= new Car();
		c1.name="Hyundai";
		c1.price=10;
		c1.color="Red";
		
		Car c3= new Car();
		c1.name="Honda";
		c1.price=20;
		c1.color="Grey";
		
		//how to access or define the static variables
		//direct calling
		System.out.println(wheels);
		
		//Static variables can be called using class name
		System.out.println(Car.wheels);
		
		//how to call static methods: Call them directly
		// no need to use the object
		//direct calling
		carSpeedTest();
		c1.start();
		
		//By using class name
		Car.carSpeedTest();
	}

}
