Feature: Login
  As a user
  I want to login to my account
  So that I can access the features on the website

  Scenario: User clicks login link while not logged in
    Given I am on the home page
    When I am not logged in And I click on the login link
    Then I am taken to the login page

  Scenario: User clicks logout link while logged in
    Given I am on the home page
    When I am logged in And I click on the logout link
    Then I should be directed to the home page

  Scenario: Login without account
    Given I am on the login page
    When I submit my login details And I don't have an account
    Then I should be notified that I need to create an account

  Scenario: Login with account
    Given I am on the login page
    When I submit my login details And the email is correct And the password is correct
    Then I should be notified that login was succesful

  Scenario: Dashboard with trainer access
    Given I am on the login page
    When I login to a trainer account
    Then I should see trainer features on my dashboard

  Scenario: Dashboard with trainee access
    Given I am on the login page
    When I login to a trainee account
    Then I should see trainee features on my dashboard
