Feature: Submit feedback
As a trainee
I would like to send feedback
So my trainer is aware of any feedback I have

	Scenario Outline: Incomplete feedback form
		Given I am on the create feedback page
		When a field is empty And I click to submit the feedback
		Then I should receive a message telling me to fill in all fields
		
	Scenario Outline: Complete feedback form
		Given I am on the create feedback page
		When no fields are empty And I click to submit the feedback
		Then I should receive a message saying that the feedback has been successfully submitted
		
	Scenario Outline: Create feedback access
		Given I am logged in
		When I click the create feedback link
		Then the I should be directed to the create feedback page
	
	Scenario Outline: Create feedback link rendered
		Given I am logged in
		When I visit my dashboard
		Then the I should be able to see the create feedback link
	
	Scenario Outline: Create feedback while logged out
		Given I am logged out
		When I click to go to the create feedback page
		Then the I should be directed to the home page
		
	Scenario Outline: Check feedback content
		Given I am logged in with a trainee account And I am on the create feedback page
		When I create my feedback
		Then the feedback I entered should be the same as what is submitted