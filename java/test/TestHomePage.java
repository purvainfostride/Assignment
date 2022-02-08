package test;

import org.testng.annotations.Test;
import pages.HomePage;


public class TestHomePage extends Base{
	HomePage hp;
	
	public TestHomePage() {
		super();
	}
@Test
	public void validatingHomePage() {
		obj.getHomePage().validateHomePage();
	}
	
}
