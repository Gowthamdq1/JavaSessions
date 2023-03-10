package OOP_Abstract;

public abstract class Page implements Web{
	
	//2 abstract methods 
	//2 Non-abstract methods
	
	//Constructor is allowed
	//Cannot create the object of the abstract class
	//but we can create the constructor of the abstract class
	//It will be called when we create the object of child class
	
	//We should always have a default constructor
	//If we have any parameterized constructor in parent abstract class then it require a def const
	public Page() { 
		  System.out.println("Page Constructor"); }
	 
	public Page(int i) {
		System.out.println("Page Constructor: "+i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("Page----Logo");
	}
	public void pageLoadingTime() {
		System.out.println("Page Loading Time : 10 secs");
	}
	
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}
	@Override
	public void privacyPolicy() {
		System.out.println("Page--Privacy Policy");
	}
}
