Feature: Create Account
As a user
I want to login to my account
So that I can access the features on the website

	Scenario Outline: Login without account
		Given I am on the login page
		When I submit my login details
		Then I should be notified that I need to create an account
		
	Scenario Outline: Login with account
		Given I am on the login page
		When I submit my login details
		Then I should be directed to my dashboard
		
	Scenario Outline: Forgotten password correct email
		Given I am on the login page
		When I click the forgotten password link And enter the registered email
		Then I should be notified that an email has been sent with reset instructions
	
	Scenario Outline: Forgotten password incorrect email
		Given I am on the login page
		When I click the forgotten password link And enter the incorrect email
		Then I should be notified that the email is invalid
	
	Scenario Outline: Already logged in
		Given I am logged in And I am on the home page
		When I click login
		Then I should be directed to the home page
