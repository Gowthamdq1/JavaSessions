package DataConversion;

public class StringReverse {
	
	//Write a Function 
	//reverseString()
	//input param: String str
	//reverse: reverse of str
	
	public static String reverseString(String name) {
		//String name="Selenium";//muineleS
		
		if(name==null) {//here we are  using ==  to the memory reference null == null
			System.out.println("Please provide the valid input");
			return null;
		}
		
		String rev="";//We should store the char returned
		int len = name.length();
		
		
		
		//If there is only one character given in String name we don't require for loop
		if(len == 1) {
			return name;
		}
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+name.charAt(i);//muineleS
			//System.out.println(rev);
		}
		return rev;
	}
	public static void main(String[] args) {
		String r1 = reverseString("123");
		System.out.println(r1);
		
		String r2 = reverseString(null);
		System.out.println(r2);
		//The above will result in NullPointerException
		
	
	}}

