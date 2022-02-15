package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.ObjectFactory;

public class Base {
	public static Properties prop;
	public static WebDriver driver;
	protected static ObjectFactory obj;
	public String username = RandomStringUtils.randomAlphabetic(10);
	public String userPass = RandomStringUtils.randomAlphanumeric(10);
	public Base(){
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\Purva\\eclipse-workspace\\Demoblaze\\Config\\config.properties");
			prop= new Properties();
			prop.load(ip);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void launchBrowser() {
		obj=new ObjectFactory();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	public void navigateToDemoblaze() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get(prop.getProperty("DemoblazeURL"));
	}
	//public static void quitBrowser() {
		//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//	driver.quit();
		//}
}
