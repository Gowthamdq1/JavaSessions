package OOP_Constructor;

public class Employee {
	
	// default Constructor
	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(int a) {
		System.out.println("Int : " + a);
		System.out.println("Parameterised constructor");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(10);

	}

}
