package WebDriver_Architecture;

public class AppTest {
	public static void main(String[] args) {
		//chrome:
		//firefox:
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		String browser ="chrome";
		//SInce this is declared inside main method so it is static already
		 WebDriver driver = null;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Pls pass the valid browser input");
		}
		
//		String a;
//		System.out.println(a);
		//Here the above is not initialized
		driver.get("https://mail.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println("page title : "+actualTitle);
		
		if(actualTitle.equals("Gowtham")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is incorrect");
		}
		driver.sendKeys("emailID", "gowtham@gmail.com");
		driver.sendKeys("password", "password@123");
		driver.click("loginBtn");
		driver.close();
		
		
		
		
	}

}
