package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Base;

public class Launch extends Base{
	@FindBy(id="signin2") WebElement signup_btn;
	public Launch() {
		PageFactory.initElements(driver, this);
	}
	public String userNavigateToDemoblaze() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl,prop.getProperty("DemoblazeURL"));
		return currentUrl;
		}
	public void clickSignup() {
		signup_btn.click();
	}
}
	
