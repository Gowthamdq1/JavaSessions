package javaSessions;

public class ConditionalOperators {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a==b) {
			System.out.println("Both are equal");
		}
		else {
			
		System.out.println("Both are not equal");
		}
		
		int total=100;
		
		if(total !=100) {
			System.out.println("Total is not matching");
		}
		else {
			System.out.println("total Is Matching");
			
		}
		
//		String browser="chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("Chrome is launched");
//		}	
//		if(browser.equals("firefox")) {
//			System.out.println("Chrome is launched");
//		}
//		if(browser.equals("safari")) {
//			System.out.println("Chrome is launched");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("Chrome is launched");
//		}
		
		//if-else
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("ff is launched");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		else if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		else {
			System.out.println("Invalid Browser");
			
		}
		
			
		
		
		
	}

}
