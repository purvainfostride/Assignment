package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utility.Base;

public class LoginPageSteps extends Base{
	LoginPage lp=new LoginPage();
	@Given("^user launched browser$")
	public void user_launched_browser() {
		Base.launchBrowser();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		
		lp.validate_user_on_loginpage();
	    
	}
	@Given("^user is on Login page$")
	public void user_is_on_Login_page() {
		lp.validate_user_on_loginpage();
	    
	}

	@When("^user enters username in the username textfield and password in password textfield$")
	public void user_enters_username_in_the_username_textfield_and_password_in_password_textfield()throws Throwable {
		try {
			lp.credentials(null, null) ;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	@When("^user clicks on the Login button$")
	public void user_clicks_on_the_Login_button() {
		lp.click_login();
	
	}

//	@Then("^user is on Homepage$")
//	public void user_is_on_Homepage() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}
//
//	@Given("user entered right credentials and clicked login")
//	public void user_entered_right_credentials_and_clicked_login() {
//	    // Write code here that turns the phrase above into concrete actions
//	  
//	}
//
//	@Then("user is on Home page")
//	public void user_is_on_Home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
//	}
}
