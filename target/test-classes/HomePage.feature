Feature: iceland home page functionalities

  @search
  Scenario: search for the individual product
    Given user is on home page of iceland website
    When user type milk in the search box
    And user click on the search box button
    Then user should be able to see related milk products

  @AutoDropDown
  Scenario: select the product from auto drop down options
    Given user is on home page of iceland website
    When user type milk in the search box auto drop down options appear
    And user do select one of the auto drop down options product
    Then user should be able to see related product

  @MenuButton
  Scenario: click on the menu button and check the drop down list
    Given user is on home page of iceland website
    When user do click on the menu button
    And user click on the drink
    And user click on the bigger pack
    Then user should able to see bigger pack related products