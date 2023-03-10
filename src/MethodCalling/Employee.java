package MethodCalling;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a,int b) {
		System.out.println("sum of two numbers");
		int sum = a+b;
		return sum;
	}
	//we are giving the input parameters as class name with variable name
	public void getInfo(Employee emp) {
		this.add(age, age);//We can call method using this keyword
		emp.name="Gowtham";
		emp.age=25;
		//emp.add(10, 20);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		//int c = e1.add(10, 20);//call by value
		//System.out.println(c);
		System.out.println(e1.name+ " : "+e1.age);
		e1.getInfo(e1);
		System.out.println(e1.name+ " : "+e1.age);
		
		
	
	
	}

}
