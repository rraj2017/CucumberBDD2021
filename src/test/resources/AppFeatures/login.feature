
Feature: Login Feature
  I want to use this template for my feature file

  Scenario Outline: Login fail-possible multiple combinations
    Given User is on Application landing page
    When User clicks on Sig in button
    Then User is displayed on login screen
    When User enters "<UserName>" in username field
    And User enters "<Password>" in password field
    And User clicks Sign in button
    Then User gets login failed error message

    Examples: 
      | UserName  | Password |
      | incorrectusername | 123456 |
      | naveenautomation | incorrectpassword |
      |incorrectusername | incorrectpassword |