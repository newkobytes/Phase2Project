Feature: Register Feature Scenario

  Background: 
    Given I launched to Swaglink
    And I enter username and password
    And I click on Loginbutton of Swag page

@WIP
  Scenario: 
    When I click product name  "Sauce Labs Backpack"
    Then I land on Add to cart page
    And I click on Add to cart button
    Then My basket value is changed to "1"
