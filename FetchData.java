package assignments;

/*Assignment on
 *Fetching data from the Excel sheet using Data-Driven Framework and Writing status in the Excel sheet which shows if the value has been
userpassed or not.*/
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchData {
    void call() throws IOException {
        WebDriver driver = new ChromeDriver();
        String username,userpass,msg;
        String path = System.getProperty("user.dir") + "/Testdata/Data.xls";
        FileInputStream fin=new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fin);
        HSSFSheet sheet = wb.getSheetAt(0);
        System.out.println(sheet.getLastRowNum());
        driver.get("https://opensource-demo.orangehrmlive.com/");
        for(int i=1;i<=sheet.getLastRowNum();i++) {
            username=sheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.name("txtUsername")).sendKeys(username);
            userpass=sheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.id("txtPassword")).sendKeys(userpass);
            FileOutputStream fo= new FileOutputStream(path);
            msg="Data entered successfully";
            sheet.getRow(i).createCell(3).setCellValue(msg);
            wb.write(fo);
            fo.close();
            driver.findElement(By.id("btnLogin")).click();
            wb.close();}
    }
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        FetchData fd = new FetchData();
        fd.call();
    }
}
