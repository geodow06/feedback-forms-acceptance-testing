Feature: Register Account
As a QA email holder
I want to create an account
So that I can login

	Scenario: User clicks create account link
		Given I am on the home page
		When I click the register link
		Then I should be directed to the register page
	
	Scenario: New user does not have QA email to create account with
		Given I am on the register page 
		When I try to register an account And I do not have a QA email
		Then I should be notified that the email is invalid
	
	Scenario: New user has QA email to create account with
		Given I am on the register page 
		When I try to create an account And I have a QA email
		Then  should be notified that the email is valid
	
	Scenario: Account already exists
		Given I am on the register page
		When I try to create an account And the account already exists
		Then I should be notified that the account already exists
	
	Scenario: Secure password creation
		Given I am on the register page
		When I try to create an account And the password is secure
		Then I should be notified that the password is valid
	
	Scenario: Insecure password creation
		Given I am on the register page
		When I try to create an account And the password is not secure
		Then I should be notified that the password is invalid
	
