Feature: Checking Login functionality of application
@validcredentials
Scenario: Checking Login functionality with the valid login credentials
Given user is on Login page
When user enters username in the username textfield and password in password textfield
| Admin | admin123 |
And user clicks on the Login button
Then user is on Homepage


