package test_pages;
import org.junit.Test;

import utility.Base;

public class testSignupPage  extends Base{

	public testSignupPage(){
		super();
	}
@Test
	public void signingup() {
	obj.getSignupPage().enterusername();
	obj.getSignupPage().enteruserpass();
	obj.getSignupPage().clickSignup();
}
}