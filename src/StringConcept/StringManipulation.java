package StringConcept;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		
		String str = "hi this is my java code i and I am so happy";
		
		int len = str.length();
		int li=0;
		int hi=len-1;
		System.out.println("Lenght of String : "+str.length());
		System.out.println("Lowest Index : "+li);
		System.out.println("Highest Index : "+hi);
		System.out.println("Character at specified index : "+str.charAt(0));
		System.out.println("Character at specified index : "+str.charAt(15));
		System.out.println("Character at specified index : "+str.charAt(5));
		System.out.println("Character at specified index : "+str.charAt(40));
		//System.out.println("Character at specified index : "+str.charAt(41));
		//The above will result in StringIndexOutOfBoundsException
		System.out.println("Character at specified index : "+str.charAt(2));
		
		System.out.println("Getting index of specified character : "+str.indexOf('h'));
		System.out.println("Getting index of specified character : "+str.indexOf("java"));
		//We can mention collection of characters for to identify their index of where it is started
		
		String m1= "Welcome admin";
		
		if(m1.indexOf("admin")==8) {
			System.out.println("Admin user is present");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(str.indexOf('i'));//1st occurence of i
		System.out.println(str.indexOf('i', 2));//2nd occurence of i
		//With above we should not hard code it and below is the solution for it
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1)+1));

		System.out.println(str.indexOf("Python"));//it will result in -1 
		// Python is not available so it is printing -1
		
		String m2="product name is macbook";
		
		if(m2.indexOf("macbook")!=-1) {
			System.out.println("Macbook is present");
		}
		else {
			System.out.println("Not Present");
		}
		
		//
		String test = "this is java program";
		System.out.println("Converting string to UPPER CASE : "+test.toUpperCase());
		System.out.println("Convertin string to lower case : "+test.toLowerCase());
		
		//trim
		String p = "    hello world     ";
		
		System.out.println(p.trim());
		
		//replace
		String h="hello world";
		System.out.println(h.replace(" ", ""));
		
		String dob = "28-01-1996";//28-01-1996
		System.out.println(dob.replace("-", "/"));
				
		String msg = "I Love java";
		System.out.println(msg.replace("Love", "Hate"));
		//We can replace specific string also and not only character
		
		String q = "    hello world     ";
		System.out.println(q.replaceAll(" ", ""));
		//It will replace all the spaces with nothing
		
		//equals:
		String e1 = "hello selenium";
		String e2 = "hello selenium ";
		System.out.println(e1.equals(e2));
		System.out.println(e1.equalsIgnoreCase(e2.trim()));
		//Here the execution will start from trim to equals Ignore case
		
		//contains:
		String tg = "welcome to naveen training";
		System.out.println(tg.contains("naveen"));
		//This is case sensitive and we cannot use equals ignore case for the above
		
		if(tg.contains("naveen")) {
			System.out.println("Enroll for it");
		}
		else {
			System.out.println("no need to enroll");
		}
		
		//split:
		String lang = "JAVA_RUBY_PYTHON_PERL";
		String[] spl = lang.split("_");
		
		System.out.println(lang.length());
		System.out.println(Arrays.toString(spl));
		for(String a:spl) {
			System.out.println(a);
		}
		String pop = "xXtestingxXSeleniumXxXautomationXXxXTrainingX";
		String pp[] = pop.split("xX");
		System.out.println(pp[0]);
		//Result:  Because the xX is splitted first and it before that there is no value and it empty 
		System.out.println(pp[1]);
		System.out.println(pp[2]);
		System.out.println(pp[3]);
		System.out.println(pp[4]);
		//System.out.println(pp[5]);//ArrayIndexOutOfBoundsException
	}

}

