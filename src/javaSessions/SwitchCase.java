package javaSessions;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String browser="chrome";
		
		switch(browser) {
		
		case "chrome":
		System.out.println("Chrome is launched");
			
		case "firefox":
		System.out.println("firefox is launched");
		
		case "safari":
		System.out.println("safari is launched");
			
		case "edge":
		System.out.println("edge is launched");
		
		default:
		System.out.println("Invalid browser input");	
		break;
		
		
		
		}
		
	}

}
