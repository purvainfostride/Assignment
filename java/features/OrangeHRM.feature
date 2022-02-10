Feature: Cheking functionality of OrangeHRMLive application
Scenario: validate user is on loginpage
   	Given user launched browser
    Then user is on login page
Scenario: Checking Login functionality with the valid login credentials
		Given user is on Login page
		When user enters username in the username textfield and password in password textfield
		And user clicks on the Login button
		Then user is on Homepage
Scenario: validate user logged in succesfully
   	Given user entered right credentials and clicked login
    Then user is on Home page


