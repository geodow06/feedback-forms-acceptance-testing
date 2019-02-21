Feature: View Trainee Feedback
  As a trainer 
  I want to be able to view trainee feedback
  So that I can review their progress

  Scenario: Click view trainee feedback link
    Given I am logged in with as a trainer
    When I click the view trainee feedback link
    Then the I should be directed to the view trainee feedback page
    
  Scenario: Check trainee feedback
    Given I am logged in with as a trainer
    When I visit the view trainee page
    Then I should be able to see feedback

