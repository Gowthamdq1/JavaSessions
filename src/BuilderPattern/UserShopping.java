package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {

		EcomApplication ecom = new EcomApplication();

		ecom.login("user@gmail.com", "password@123").doSearch("I Phone", 80000).addToCart("I Phone")
				.doPayment("abc@axis").generateOrder().logOut();

		System.out.println("---------------------");

		ecom.login("user1@gmail.com", "admin@123").doSearch("I phone", 90000, "Apple").addToCart("I Phone").logOut();

		System.out.println("---------------------");

		ecom.login("abc@yahoo.com", "test#123").addToCart("I Phone").logOut();

	}

}
