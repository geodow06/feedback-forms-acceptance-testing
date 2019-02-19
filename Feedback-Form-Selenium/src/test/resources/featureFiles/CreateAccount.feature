Feature: Create Account
As a QA email holder
I want to create an account
So that I can login

	Scenario: User clicks create account link
		Given I am on the home page
		When I click the account link
		Then I be directed to the reach the login page
	
	Scenario: New user does not have QA email to create account with
		Given I am on the create account page And I do not have a QA email
		When I try to create an account
		Then it should fail
	
	Scenario: New user has QA email to create account with
		Given I am on the create account page And I have a QA email
		When I try to create an account
		Then it should succeed
	
	Scenario: Account already exists
		Given I am on the create account page And I have entered my QA email
		When I enter my QA email and a valid password
		Then I should be notified that the account already exists
	
	Scenario: Trainer access
		Given I am on the create account page And I have entered a QA trainer email
		When I enter a create my account And I go to the home page
		Then I should see trainer features
	
	Scenario: Trainee access
		Given I am on the create account page And I have entered a QA trainee email
		When I enter create my account And I go to the home page
		Then I should see trainee features
	
	Scenario: Secure password creation
		Given I am on the create account page And I have entered my QA email
		When I enter a secure password
		Then the account creation should succeed
	
	Scenario: Insecure password creation
		Given I am on the create account page And I have entered my QA email
		When I enter an insecure password
		Then the account creation should fail
	
