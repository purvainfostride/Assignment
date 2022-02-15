package test_pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utility.Base;

public class testPurchaseItems extends Base {
	@FindBy(linkText="Samsung galaxy s6") WebElement selecteditem;
	public testPurchaseItems() {
		super();
	}
	@Test
	public void purchasingItems() {
		obj.getPurchaseItem().purchase();
	}
	@Test
	public void validatedSelectedPurchase() {
		obj.getPurchaseItem().checkPurchasedItem();
		Assert.assertTrue(selecteditem.isDisplayed());
	}
}
