package BuilderPattern;

public class EcomApplication {

	public EcomApplication login() {
		System.out.println("Login to app");
		return this;
	}

	public EcomApplication login(String userName, String password) {
		System.out.println("Login to app : " + userName + " : " + password);
		return this;
	}

	public EcomApplication doSearch(String productName, int price) {
		System.out.println("Search product : " + productName + "Price : " + price);
		return this;
	}

	public EcomApplication doSearch(String productName, int price, String brand) {
		System.out.println("Search product : " + productName + "Price : " + price + "brand : " + brand);
		return this;
	}

	public EcomApplication addToCart(String productName) {
		System.out.println("Adding to cart : " + productName);
		return this;
	}

	public EcomApplication doPayment(String cc, int cvv) {
		System.out.println("Making payment using : " + cc + " " + cvv);
		return this;
	}

	public EcomApplication doPayment(String upi) {
		System.out.println("Making payment using : " + upi);
		return this;
	}

	public EcomApplication doPayment(String paypalID, String password) {
		System.out.println("Making payment using : " + paypalID + " " + password);
		return this;
	}

	public EcomApplication generateOrder() {
		System.out.println("your order id is : " + 12345);
		return this;
	}

	public void logOut() {
		System.out.println("Log Out");
	}

}
