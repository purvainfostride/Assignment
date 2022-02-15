package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Base;

public class PurchaseItems extends Base{
	    @FindBy(linkText="Samsung galaxy s6") WebElement selecteditem;
	    @FindBy(xpath = "//button[contains(text(),'Place Order')]") WebElement placeorderbutton;
	    @FindBy(id = "name") WebElement name;
	    @FindBy(id = "country") WebElement country;
	    @FindBy(id = "city") WebElement city;
	    @FindBy(id="card") WebElement card;
	    @FindBy(id="month") WebElement month;
	    @FindBy(id="year") WebElement year;
	    @FindBy(xpath = "//button[contains(text(),'Purchase')]") WebElement purchasebutton;
	    @FindBy(xpath = "//button[contains(text(),'OK')]") WebElement okbutton;
	    @FindBy(linkText="Cart") WebElement clickOnCart;
	    
	    public PurchaseItems(){
	        PageFactory.initElements(driver,this);
	    }
	    public void purchase() {
	    	selecteditem.click();
	        placeorderbutton.click();
	        name.sendKeys(prop.getProperty("customer_name"));
	        country.sendKeys(prop.getProperty("customer_country"));
	        city.sendKeys(prop.getProperty("customer_city"));
	        card.sendKeys(prop.getProperty("customer_card"));
	        month.sendKeys(prop.getProperty("customer_month"));
	        year.sendKeys(prop.getProperty("customer_year"));
	        purchasebutton.click();
	        okbutton.click();
	        driver.navigate().to(prop.getProperty("homeurl"));
	    }
	    public void checkPurchasedItem() {
	    	clickOnCart.click();
	    }
	}
