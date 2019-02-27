Feature: View cohorts
  As a trainer
  I want to view individual cohorts
  So I can check what week they are in

  Scenario: Click cohort link
    Given I am logged in as a trainer And I want to view the cohorts
    And I am on the homepage
    When I click on the cohorts link
    Then I should be directed to the view cohorts page

  Scenario: Click add cohort button
    Given I am logged in as a trainer And I want to view the cohorts
    And I am on the cohorts page
    When I click on the add cohort button
    Then I should be directed to the create cohort page

  Scenario: Add new cohort
    Given I am logged in as a trainer And I want to view the cohorts
    And I am on the create cohort page
    When I enter cohort details
    Then I want to verify that the cohort has been created
