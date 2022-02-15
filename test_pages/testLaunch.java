package test_pages;

import utility.Base;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testLaunch extends Base{
	
	public testLaunch() {
		super();
	}
@BeforeSuite
	public void Launch_Browser() {
		launchBrowser();
		obj.getBase().navigateToDemoblaze();;
	}
@Test
	public static void validateUserNavigateToDemoblaze() {
		obj.getLaunch().userNavigateToDemoblaze();
		
	}
@Test
	public static void clickingSignupBtn() {
		obj.getLaunch().clickSignup();	
		}
}