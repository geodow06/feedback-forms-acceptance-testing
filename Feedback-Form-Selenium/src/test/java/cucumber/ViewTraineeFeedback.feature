Feature: View Trainee Feedback
As a trainer 
I want to be able to view trainee feedback
So that I can review their progress

	Scenario Outline: Check trainee feedback as trainer
		Given I am logged in with a trainer account
		When I visit the view trainee page
		Then the feedback I entered should be the same as what is submitted

	Scenario Outline: Check feedback access
		Given I am logged in with a trainer account
		When I click the view trainees link
		Then the I should be directed to the view trainees page
		
	Scenario Outline: Check feedback render
		Given I am logged in with a trainer account
		When I am on my dashboard
		Then the I should be able to see to the view trainees link
