package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import utility.Base;


public class HomePage extends Base{
	 @FindBy(id = "menu_admin_viewAdminModule") WebElement admin;
		String validate;
	public String validateHomePage() {
		validate= driver.getCurrentUrl();
		Assert.assertEquals(validate, "https://opensource-demo.orangehrmlive.com/index.php/dashboard", "User is on Home Page");
		return validate;
	}
}
