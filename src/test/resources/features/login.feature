Feature: User should be able to login and select a product


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

    @main
    Scenario: User should be able to select a product and add it to Favorites.
      When user hover over Cosmetic & Personal Care tab
      And user clicks on Perfume & Deodorant item
      And user search for ‘Lacoste’ in Brand filter
      And user select Lacoste
      And user click 7th product on the search result page
      And user add product to the ‘Favorites’
      And user navigate to Favorites
      Then verify the product title is the same as with the product details page

