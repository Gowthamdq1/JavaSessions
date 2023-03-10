package ExceptionHandling;

public class Employee {
	
	String name;
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		//ArithmeticException Cannot divide by zero
		
		try {
			Employee obj = new Employee();
			obj=null;
			obj.name="Gowtham";
			int i=9/0;
			System.out.println("Hello");//hello will not be printed because when the exception occurs
			//It will directly jump into catch block
		}
		catch(NullPointerException  e) {
			e.printStackTrace();
		}
		catch(ArithmeticException  e) {
			e.printStackTrace();
		}
		System.out.println("BYE");
	}

}
