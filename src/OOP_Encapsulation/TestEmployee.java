package OOP_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Gowtham";
		e1.age = 26;

		e1.setSalary(5.85);
		System.out.println(e1.getSalary());

		Company c1 = new Company("IVY", 650, 100);
		c1.setName("IBM");
		c1.setEmpCount(10650);
		c1.setSharePrice(1000);

		System.out.println(c1.getName());
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getSharePrice());

		// Register
		RegisterPage reg = new RegisterPage("Gowtham", 26, "India", "28-01-1996");

		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getAddress());

		reg.setAddress("Chennai 600048");

		System.out.println(reg.getAddress());

		Browser b = new Browser();
		b.launchBrowser();
	}

}
