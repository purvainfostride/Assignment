
package assignments;

/**Assignment on Axes-Xpath 
 * Implemented the following:
 * Q1- Found signup button in Facebook website by Child method
 * Q2- Located Firstname field from Signup button using Parent method
 * Q3- Identifyed the password field from mobile number field by using following method
 * Q4- Located mobile number from new password by using Preceding method
 * Q5- Fetched All the news from BBC website
 * @author Purva */
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

public class Axes_Xpath {
	WebDriver driver= new ChromeDriver();
	String fName = RandomStringUtils.randomAlphabetic(10);
	String mno = RandomStringUtils.randomNumeric(10);
	String userPass = RandomStringUtils.randomAlphanumeric(10);
	String GoogleURL="https://www.google.co.in/";
	String FacebookURL= "https://www.facebook.com/";
	
	void PreSetup() {
		driver.get(GoogleURL);
		driver.navigate().to(FacebookURL);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));}

	void Q1() {
		driver.findElement(By.xpath("//div[@class='_1lch']//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));}
	
	void Q2() {
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']/parent::div[@class='_1lch']"
			  + "/preceding-sibling::div[@id='fullname_field']//child::input[@name='firstname']")).sendKeys(fName);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));}
	
	void Q3() {
		driver.findElement(By.xpath("//input[@name='reg_email__']//following::input[@name='reg_passwd__']"))
		.sendKeys(userPass);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));	}

	void Q4() {
		driver.findElement(By.xpath("//input[@name='reg_passwd__']//preceding::input[@name='reg_email__']"))
		.sendKeys(mno);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.close();}
	
	void Q5() {
		driver = new ChromeDriver();// driver has been re-opened
		driver.navigate().to("https://www.bbc.com/news");
		driver.manage().window().maximize();
		//driver.get("https://www.bbc.com/news");
		List<WebElement> allnews = driver.findElements(By.tagName("a"));//Q5
		System.out.println(allnews.size());
		for(int i = 0;i<allnews.size();i++){
		String news = allnews.get(i).getText();
		System.out.println("Fetching All the news present on BBC Website: ");
		System.out.println(news);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.close();}
}
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Axes_Xpath A= new Axes_Xpath();
		A.PreSetup();
		A.Q1();
		A.Q2();
		A.Q4();
		A.Q3();
		A.Q5();
	}
}