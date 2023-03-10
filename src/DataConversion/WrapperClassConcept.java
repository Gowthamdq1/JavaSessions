package DataConversion;

public class WrapperClassConcept {
	
	public static void main(String[] args) {
		String x="100";
		System.out.println(x+20);//10020
		//The above results in concatenation
		
		//String to int
		//Integer is a class
		int i = Integer.parseInt(x);
		//It will convert the string into equivalent integer value
		
		System.out.println(i+20);//120
		//Now we have converted the string value to int value using parseInt method which is a static method and called by its class name Integer
		
		String y ="100USD";
		System.out.println(y+20);
		
		String[] curr = y.split("USD");
		int j = Integer.parseInt(curr[0]);
		System.out.println(j+20);//NumberFormatException
		//The above will not take any ascii value it will result in NFE
		
		//String to double
		String z = "12.33";
		System.out.println(z+20);//Concatenation will happen: 12.3320
		double d = Double.parseDouble(z);
		System.out.println(d+20);
		
		//String to boolean
		String headless = "true";
		boolean boo= Boolean.parseBoolean(headless);
		if(Boolean.parseBoolean(headless)) {
			System.out.println("Run in headless");
		}
		
		//int to String
		int k = 100;
		String k1 = String.valueOf(k);
		System.out.println(k1+20);//Because it has been converted to string already using valueOf
		
		//boolean to String
		boolean bo = false;
		String bool = String.valueOf(bo);
//		if(bool) {//this becomes string now and not boolean so if condition will faile
//			
//		}
		
		//maximum and minimum range of integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
			
			
		
		
	}

}
