package OOP_Encapsulation;

public class Application {

	String name;

	public void m1() {

		// call static method from non static method
		// no need to create the object
		// This will result in Stackoverflow exception
		t2();
		System.out.println("m1 method");
		name = "Gowtham";
		System.out.println(name);
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");

	}

	public static void t1() {
		System.out.println("T1 method");
		Application a1 = new Application();
		a1.m1();// We have created object inside method to call non static method in static
				// method
		t2();
	}

	public static void t2() {
		System.out.println("T2 method");
		t3();
	}

	public static void t3() {
		System.out.println("T3 method");
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.m1();
		System.out.println(app.name);
		Application.t1();
	}

}
