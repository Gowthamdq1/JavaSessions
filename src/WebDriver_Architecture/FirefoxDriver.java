package WebDriver_Architecture;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Firefox is launched");
	}
	
	@Override
	public void findElement(String element) {
		System.out.println("Find element : "+element);
	}

	@Override
	public void get(String url) {
		System.out.println("Enter url : "+url);
	}

	@Override
	public String getTitle() {
		System.out.println("getting the page title");
		return "Gowtham";
	}

	@Override
	public void click(String element) {
		System.out.println("Clicking on element:"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering value : "+value+"into "+element);
	}

	@Override
	public void close() {
		System.out.println("Close Browser");
		
	}

}
