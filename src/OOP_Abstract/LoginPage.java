package OOP_Abstract;

public class LoginPage extends Page{

	//What if we have a constructor in loginpage also ?
	//This will call the parent class constructor first and then the child class constructor
	//Also this will call the constructor from the page class and not loginpage class
	public LoginPage() {
		System.out.println("Login Page--Constructor");
	}
	//To call this constructor we need to input the value
	//It will call the default constructor of parent
	//This will always call default constructor
	public LoginPage(int i) {
		System.out.println("Login Page--Constructor:"+i);
	}
	
	@Override
	public void title() {
		System.out.println("LP----title");
	}

	@Override
	public void url() {
		System.out.println("LP----url");
	}
	public void resetPwd() {
		System.out.println("LP----reset Password");
	}
	@Override
	public void pageLoadingTime() {
		System.out.println("Login Page Loading Time : 5 secs");
	}
	public static void pageCycle() {
		System.out.println("Login Page Cycle");
	}
	@Override
	public void privacyPolicy() {
		System.out.println("Login Page--Privacy Policy");
	}
	

}
