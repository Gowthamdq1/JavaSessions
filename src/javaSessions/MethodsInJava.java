package javaSessions;

public class MethodsInJava {
	//no input and no return 
	public void test() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);//we are not passing any input or returning anything
	}
	//no input and some return
	public int getBillingAmount() {
		System.out.println("Get billing amount");
		int foodBills = 100;
		int drinkBills = 300;
		int totalAmount = foodBills+drinkBills;
		return totalAmount;//Because we are returning a total amount from the sum
	}
	
	public String getEmployeeName() {
		System.out.println("get emp name");
		String name = "Gowtham";
		return name;
	}
	public String getName() {
		System.out.println("get name");
		return "gowtham";
	}
	public int getNumber() {
		return 100;
	}
	public boolean isElementExist() {
		System.out.println("Check element is present");
		boolean flag=true;
		return flag;
	}
	//some input and some return
	public int getSum(int a, int b) {
		System.out.println("Sum of two numbers");
		int sum = a+b;
		return sum;
	}
	
	public String getempName(String name , int age) {
		System.out.println("Employee age");
		
		return name +" : "+age;
	}
	
	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		int billingAmount = obj.getBillingAmount();
		System.out.println("Billing Amount : "+billingAmount);
		
		int s1 = obj.getSum(10, 20);//calling a function by value 
		//arguments are passed when we call a function 
		//parameters are passed when we create a function 
		System.out.println(s1);
		
		int s2 = obj.getSum(50, 60);
		System.out.println(s2);
	
		
		String name = obj.getempName("Gowtham", 26);
		System.out.println(name);
		
	}

}
