package pages;

import java.time.Duration;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Base;

public class SignupPage extends Base{
	
	@FindBy(using="#sign-username") WebElement usernamefield;
	@FindBy(id="sign-password") WebElement userpassfield;
	@FindBy(className="btn btn-primary") WebElement signupBtn;
	
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterusername() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		usernamefield.click();
		usernamefield.sendKeys(username);
	}
	public void enteruserpass() {
		usernamefield.sendKeys(userPass);
	}
	public void clickSignup() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		signupBtn.click();
	}
}
