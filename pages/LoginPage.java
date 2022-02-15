package pages;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Base;

public class LoginPage extends Base{
	@FindBy(using="#login2") WebElement loginBtn;
	@FindBy(className="btn btn-primary") WebElement login;
	@FindBy(partialLinkText="Log out") WebElement checkvalidation;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void loggingin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		obj.getSignupPage().enterusername();	
		obj.getSignupPage().enteruserpass();	
		obj.getSignupPage().clickSignup();
		login.click();
	}
	public void validate_login() {
		Assert.assertTrue(checkvalidation.isDisplayed());
	}
}
