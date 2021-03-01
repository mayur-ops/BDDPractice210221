Feature: iceland milk product result page functionalities

  Background:
    Given user is on home page of iceland website
    When user type milk in the search box
    And user click on the search box button
    Then user should be able to see related milk products

    @Results
    Scenario: select the semi-skimmed milk from the lists
      Given user is on the milk results page
      When user select the semi-skimmed milk from the lists
      Then user should be able to see individual milk product

      @SortBy
      Scenario: user sort product by bestsellers
        Given user is on the milk results page
        When user select the bestsellers dropdown options
        Then user should able to see bestsellers option related product

      @PriceRange
      Scenario: user want to see products by price range
        Given user is on the milk results page
        When user select the one pound and two pound range products
        Then user should able to see related price range products

      @BrandName
      Scenario: user want to see products by brand name
        Given user is on the milk results page
        When user select the iceland brand products
        Then use should able to see all iceland brand related products

      @MilkType
      Scenario: user want to select type of milk products
        Given user is on the milk results page
        When user select the oat type of milk
        Then user should be able to see oat type of milk related products