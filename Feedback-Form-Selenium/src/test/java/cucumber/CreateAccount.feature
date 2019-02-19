Feature: Create Account
As a QA email holder
I want to create an account
So that I can login

	Scenario Outline: User clicks create account link
		Given I am on the home page
		When I click the account link
		Then I be directed to the reach the login page
	
	Scenario Outline: New user does not have QA email to create account with
		Given I am on the create account page And I do not have a QA email
		When I try to create an account
		Then it should fail
	
	Scenario Outline: New user has QA email to create account with
		Given I am on the create account page And I have a QA email
		When I try to create an account
		Then it should succeed
	
	Scenario Outline: Account already exists
		Given I am on the create account page And I have entered my QA email
		When I enter my QA email and a valid password
		Then I should be notified that the account already exists
	
	Scenario Outline: Trainer access
		Given I am on the create account page And I have entered a QA trainer email
		When I enter a create my account And I go to the home page
		Then I should see trainer features
	
	Scenario Outline: Trainee access
		Given I am on the create account page And I have entered a QA trainee email
		When I enter create my account And I go to the home page
		Then I should see trainee features
	
	Scenario Outline: Secure password creation
		Given I am on the create account page And I have entered my QA email
		When I enter a secure password
		Then the account creation should succeed
	
	Scenario Outline: Insecure password creation
		Given I am on the create account page And I have entered my QA email
		When I enter an insecure password
		Then the account creation should fail
	
