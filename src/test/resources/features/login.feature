Feature: User should be able to login

  Scenario: User should be able to login with facebook
    Given user is on the home page (https://www.n11.com/)
    When user clicks on login button
    And user clicks on login with facebook
    Then user can login