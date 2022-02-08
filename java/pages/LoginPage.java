package pages;

import test.Base;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

public class LoginPage extends Base{
	
	@FindBy(id="txtUsername") WebElement uname;
	@FindBy(id="txtPassword") WebElement upass;
	@FindBy (id="btnLogin") WebElement login_btn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String verify_UserLoggedIn() {
		return driver.getTitle();
	}
	public void login() throws Throwable {
		File source= new File("C:\\Users\\Purva\\eclipse-workspace\\OrangeHRM\\TestData\\OrangeHRMLive.xlsx"); 
    	FileInputStream is=new FileInputStream(source);
    	XSSFWorkbook wb= new XSSFWorkbook(is);
    	XSSFSheet sheet= wb.getSheetAt(0);
    	String username=sheet.getRow(1).getCell(0).getStringCellValue();
    	String password=sheet.getRow(1).getCell(1).getStringCellValue();
     	uname.sendKeys(username);
    	upass.sendKeys(password);
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	login_btn.click();
    	wb.close();
    	}
}
