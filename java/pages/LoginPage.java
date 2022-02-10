package pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Base;

public class LoginPage extends Base{
	@FindBy(id="txtUsername") WebElement uname;
	@FindBy(id="txtPassword") WebElement upass;
	@FindBy (id="btnLogin") WebElement login_btn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String validate_user_on_loginpage() {
		String validate = driver.getCurrentUrl();
		Assert.assertEquals(validate, "https://opensource-demo.orangehrmlive.com/index.php/dashboard", "User is on Login Page");
		return validate;
	}
	public void credentials(String username, String password) throws Throwable {
     	uname.sendKeys(username);
    	upass.sendKeys(password);}
    public void click_login() {
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	login_btn.click();
    	}
	public String validate_Login() {
		String validateLogin= driver.getCurrentUrl();
		Assert.assertEquals(validateLogin, "https://opensource-demo.orangehrmlive.com/index.php/dashboard", "User is on Home Page");
		return validateLogin;
	}
}
