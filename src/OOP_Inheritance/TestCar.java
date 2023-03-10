package OOP_Inheritance;

import java.util.Arrays;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.stop();
		b.reFuel();
		b.autoParking();
		b.petrolEngine();
		BMW.billing();//We are calling the inherited static method in BMW class
		Car.billing();//We are calling the static method from parent class
		
		BMW.display();//We are calling inherited public static final method from Car class called using class name
		b.running();//We are calling inherited final public final method from car class using BMW object since it is non static
		
		b.payment("gowtham@abc");
		
		b.engine();
		
		System.out.println("=========");
		
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();
		
//		b.theftSafety();Sibling methods cannot be called 
		
		System.out.println("=========");
		Car c = new Car();
		c.start();
		c.stop();
		c.reFuel();
		c.payment("asdkfjhsda");
		c.engine();
		System.out.println("=========");
		//Top Casting
		//child class object can be referred by grand parent class ref variable
		//We can say every BMW is a vehicle
		Vehicle ve = new BMW();
		ve.petrolEngine();
		
		//Reference type check will be failed
//		ve.autoParking();
		ve.engine();
		
		
		System.out.println("=========");
		//Child class object can be referred by parent class ref variable
		Car c1 = new BMW();
		c1.start();
		c1.stop();c1.reFuel();
		
		//parent class object cannot be referred by child class ref variable
		//BMW b1 = (BMW)new Car();//We are converting result in ClassCastException at runtime
		//We never do downcasting
		//Compile time it will not throw any error 
		//Run time will result in ClassCastException 
		
		
		
		
		
	}
	
	

}
