package javaSessions;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	
	public static void main(String[] args) {
		
	Employee e1=new Employee();
	e1.name="Gowtham";
	e1.age=26;
	e1.city="Chennai";
	e1.salary = 9;
	
	System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
	//Gowtham 26 Chennai 9.0
	
	Employee e2=new Employee();
	System.out.println(e2.name);
	System.out.println(e2.age);
	System.out.println(e2.city);
	System.out.println(e2.salary);
	//null 0 null 0.0 It is referring to variables where no value is provided
	
//	Employee e3 = new Employee();
//	e3=null;//Null reference object
//	e3.name="Tom";
//	System.out.println(e3.name);
//	//NullPointerException Since the e3=null so it is null and null to call an variable will result in 
//	//NullPointerException
//	//Default value of object is null
	
	//Object without references - No reference object
	System.out.println(new Employee().name="Gowtham");//Gowtham
	new Employee().age=26;
	//The object will be created with no name given to it . but It will capture the photocopy of class variables
	//This will result in multiple object creation
	
	
	
		
		
	}

}
