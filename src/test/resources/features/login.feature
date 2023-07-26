Feature: User should be able to login


  Background: User is expected to be on login page
    Given user is on the home page

  @main
  Scenario: User should be able to login with facebook
    When user clicks on login button
    And user clicks on facebook button
    And user enter email or phone number
    And user enter password
    And user clicks on Facebook login button
    Then user should be able to login

