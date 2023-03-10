package OOP_Abstract;

public class PageTest {
	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPwd();
		
		Page.pageCycle();
		LoginPage.pageCycle();
		lp.privacyPolicy();
		//Top Casting:
		//child class object can be referred by abstract parent class, interface refand normal class ref variable
		System.out.println("---------------------");
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		pg.privacyPolicy();
		//down casting? - NA
		//We cannot create object for abstract class but can we create constructor of page class ? 
		//We can create the constructor of the abstract class
		
		
		
	}

}
