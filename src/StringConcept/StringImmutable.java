package StringConcept;

public class StringImmutable {
	
	public static void main(String[] args) {
		int i=10;
		i=20;
		i=30;
		//The above scenario we are able to update the value and it is mutable
		//Mutable = can change the value
		//Immutable = cannot change the value
		
		String s = "selenium";
		s="cypress";
		System.out.println(s);//cypress
		
		String t="selenium";
		//This will not delete the existing selenium instead it just point to selenium with ref t
		//The selenium is still there and it is not changed so it is immutable
		
		String s1 ="Selenium";
		
		System.out.println(s1+"automation");
		//It will create one more entry called selenium automation, it will not have any reference
		//When we are trying to make any change it will create new entry only 
		System.out.println(s1);
		
		s1="cypress";
		
		System.out.println(s1);//object ref will be changed to cypress now from selenium
		
		String t1="selenium";
		System.out.println(t1);
		
		String p="Naveen";
		
		p=p+"Automation Labs";
		System.out.println(p);
		
		String t2="Naveen";
		System.out.println(t2);
		
		String r="    hello Selenium    ";
		r=r.trim();
		System.out.println(r);
		//To avoid multiple duplicate or object creations we should for String builder / buffer
		//which above methods are mutable and can be changed
		
		
		
	}

}
