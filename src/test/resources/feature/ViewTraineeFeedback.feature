Feature: View Trainee Feedback
  As a trainer 
  I want to be able to view trainee feedback
  So that I can review their progress

  Scenario: Click view cohort link
    Given I am logged in with a trainer account
    When I click the view cohort link
    Then the I should be directed to the view cohort page

  Scenario: Check trainee feedback
    Given I am on the view cohort page
    When I click on a cohort
    Then I should be taken to the view cohort page
