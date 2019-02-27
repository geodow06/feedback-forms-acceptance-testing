Feature: Submit feedback
  As a trainee
  I would like to send feedback
  So my trainer is aware of any feedback I have

  Scenario: Incomplete feedback form
    Given I am on the create feedback page
    When a field is empty And I click to submit the feedback
    Then I should receive a message telling me to fill in all fields

  Scenario: Complete feedback form
    Given I am on the create feedback page
    When no fields are empty And I click to submit the feedback
    Then I should receive a message saying that the feedback has been successfully submitted

  Scenario: User clicks create feedback link
    Given I am logged in
    When I click the create feedback link
    Then the I should be directed to the create feedback page
