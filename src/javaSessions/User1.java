package javaSessions;

public class User1 {
	
	//Object reference name can also be interchanged
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		
		User1 u1=new User1();
		u1.name="Tom";
		u1.age=10;
		u1.city="US";
		User1 u2=new User1();
		u2.name="Adam";
		u2.age=11;
		u2.city="AUD";
		User1 u3=new User1();
		u3.name="Warner";
		u3.age=12;
		u3.city="EUR";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
//		Tom 10 US
//		Adam 11 AUD
//		Warner 12 EUR
		System.out.println("===============================");
		u1=u2;//
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
//		Adam 11 AUD
//		Adam 11 AUD
//		Warner 12 EUR
		System.out.println("===============================");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
//		Adam 11 AUD
//		Warner 12 EUR
//		Warner 12 EUR
		System.out.println("===============================");
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
//		Adam 11 AUD
//		Warner 12 EUR
//		Adam 11 AUD
		
		
		
		
	}

}
