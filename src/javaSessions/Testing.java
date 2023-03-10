package javaSessions;

public class Testing {

	public boolean launchBrowser(String browserName) {
		boolean flag = false;

		switch (browserName.toLowerCase().trim()) {

		case "chrome":
			System.out.println("Chrome is launched");
			flag = true;
			break;

		case "firefox":
			System.out.println("firefox is launched");
			flag = true;
			break;

		case "safari":
			System.out.println("safari is launched");
			flag = true;
			break;

		case "IE":
			System.out.println("IE is launched");
			flag = true;
			break;

		default:
			System.out.println("browser is not found");
			break;
		}
		return flag;
	}

	public static void main(String[] args) {

		Testing t = new Testing();
		if (t.launchBrowser(" Firefox ")) {
			System.out.println("Launch the url");
		} else {
			System.out.println("Invalid browser input");
		}

	}

}
