package javaSessions;

public class User_Assignment {
	
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
		
		User1 u4=new User1();
		u4.name="Young";
		u4.age=13;
		u4.city="JPY";
	
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
//		Tom 10 US
//		Adam 11 AUD
//		Warner 12 EUR
//		Young 13 JPY
		
		System.out.println("==============================");
		
		u1=u2;
		u1.name="gowtham";
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
//		Adam 11 AUD
//		Adam 11 AUD
//		Warner 12 EUR
//		Young 13 JPY
		
		System.out.println("==============================");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
//		Adam 11 AUD
//		Warner 12 EUR
//		Warner 12 EUR
//		Young 13 JPY
		
		System.out.println("==============================");
		u3=u4;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
//		Adam 11 AUD
//		Warner 12 EUR
//		Young 13 JPY
//		Young 13 JPY
		
		System.out.println("==============================");
		u4=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
//		Adam 11 AUD
//		Warner 12 EUR
//		Young 13 JPY
//		Adam 11 AUD
		 
		
	}

}
