Feature: View Trainees
As a trainer 
I want to see trainees
So that I can access their data

	Scenario: Check cohort access
		Given I am logged in with a trainer account
		When I click the view cohort link
		Then the I should be directed to the view cohort page
		
	Scenario: Check cohort render
		Given I am logged in with a trainer account
		When I am on my dashboard
		Then the I should be able to see to the view cohort link

	Scenario: View trainee in cohort
		Given I am on the view cohort page
		When I click on a trainee
		Then the I should be directed to the view trainee page for that trainee