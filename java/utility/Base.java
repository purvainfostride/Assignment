package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class Base {
	public static Properties prop;
	public static WebDriver driver;
		
	public Base(){
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\Purva\\eclipse-workspace\\CucumberWithPOM\\src\\test\\java\\config\\config.properties");
			prop= new Properties();
			prop.load(ip);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
