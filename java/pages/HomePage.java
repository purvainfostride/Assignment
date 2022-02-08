package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import test.Base;

public class HomePage extends Base{
	 @FindBy(id = "menu_admin_viewAdminModule") WebElement admin;
		String verify;
	public String validateHomePage() {
		verify= driver.getCurrentUrl();
		Assert.assertEquals(verify, "https://opensource-demo.orangehrmlive.com/index.php/dashboard", "User is on Home Page");
		return verify;
	}
	
		
	
}
