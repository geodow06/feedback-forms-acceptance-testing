Feature: View Trainees
As a trainer 
I want to see trainees
So that I can access their data

	Scenario: I click trainees link while logged in as a trainer
		Given I am logged in as a trainer And I want to view the trainees
		When I click the view cohort link
		Then the I should be directed to the view cohort page
		
