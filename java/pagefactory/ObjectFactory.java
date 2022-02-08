package pagefactory;

import pages.HomePage;
import pages.LoginPage;

public class ObjectFactory {
	private LoginPage LoginObj;
	private HomePage HomeObj;
	
	public LoginPage getLoginPage() {
		if(LoginObj==null) {
			LoginObj= new LoginPage();
		}
		return LoginObj;
	}
	public HomePage getHomePage() {
		if(HomeObj==null) {
			HomeObj= new HomePage();
		}
		return HomeObj;
	}
}
