package OOP_Constructor;

public class User {
	
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	//hidden constructor..default constructor will be added by JVM
	
	public User(String name,int age) {
		this.name = name;
		this.age= age;
	}
	public User(String name, int age, String email) {
		this.name=name;
		this.age=age;
		this.email=email;
	}
	
	
	public static void main(String[] args) {
		
		User u1 = new User("Gowtham", 10);
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.email);
		System.out.println("================");
		User u2 = new User("Tom", 20, "Tom@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.email);
		
		
		
		
		
	}

}
