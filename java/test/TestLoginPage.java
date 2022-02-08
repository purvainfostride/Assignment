package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestLoginPage extends Base{
	String title;
	public TestLoginPage() {
		super();
	}
@BeforeSuite
	public void Launch_Browser() {
		launchBrowser();
	}
@Test
	public void loggingIn() throws Throwable {
		obj.getLoginPage().login();
	}




}
