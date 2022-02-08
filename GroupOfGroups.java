package assignments;

/**Assignment on implementing groupsofgroups concept
 * @author Purva */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class GroupOfGroups {
	public static WebDriver driver;
	public static String path;
	String uname="Admin";
	String pass="admin123";
@BeforeSuite(groups= {"group1"})
	public void lauch() {
		path=System.getProperty("user.dir")+ "//Driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		}
@Test(groups= {"group1"})
	public void login() {
		driver.findElement(By.name("txtUsername")).sendKeys(uname);
		driver.findElement(By.name("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();
	}
@Test(groups= {"group2"})
	public void forgetpass(){
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
	}
@AfterSuite(groups= {"group3"})
	public void closebrowser() {
		driver.close();
		}
}