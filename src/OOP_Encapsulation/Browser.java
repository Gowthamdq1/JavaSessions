package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Trying to launch browser");
		checkRAM();
		checkVersion();
		checkOS();
		checkBrowserServices();
		System.out.println("Browser Launched");
	}

	private void checkRAM() {
		System.out.println("Check Ram");
	}

	private void checkVersion() {
		System.out.println("Check Version");
	}

	private void checkOS() {
		System.out.println("Check OS");
	}

	private void checkBrowserServices() {
		System.out.println("Check browser services");
	}

}
