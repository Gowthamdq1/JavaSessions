package StringConcept;

public class Stringconcept {
	public static void main(String[] args) {
		
		//String literals
		String str = "Selenium";
		String str1 = "Selenium";
		String str2 = "selenium";
		
		String t1 = "Java";
		
		System.out.println(str==str1);
		//This is comparing the reference are pointing to same memory address
		System.out.println(str.equals(str1));
		//This compare the respective string values
		
		//String object with new keyword:
		String st1 = new String("testing");
		//There are so many constructors for class string
		//String is a class, Hence we can create object of it
		
		String st2 = new String("testing");
		//For the above two objects will be created in Heap
		
		String s3="testing";
		String s4="testing";
		//The above will not create any object instead both reference will point out to same memory reference
		
		System.out.println(s3==s4);//true
		System.out.println(st1==st2);//false
		//Because both object references are having different memory allocation , hence result in false
		
		System.out.println(st1.equals(st2));//true
		// == will compare memory references
		// .equals will compare string values
		
		
		System.out.println(st1==s3);//false - bcz of diff memory address
		System.out.println(s3==s4);//true
		
//		String s5 = "Testing";//1--SCP
//		s5=null;
//		System.out.println(s5.length());//NullPointerException
		
		String s6="Gowtham";
		s6="Tom";
		//Now the object reference will stop pointing to gowtham and start pointing to Tom now
		//Garbage collector will destroy which is having null reference or no reference
		
		
		
		
		
		
		
		
		
		
		
	}

}
