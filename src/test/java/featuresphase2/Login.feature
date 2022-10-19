Feature: Login Feature of Swag labs

  @sanity
  Scenario: This scenario is login the Swag path using valid credentials
    Given I have launched the application
    When I enter the correct username and password
    And I click on login button
    Then I should land on the home page

  @sanity @regression
  Scenario: This scenario is to login the swag path using incorrect credentials
    Given I have launched the application
    When I enter the incorrect username and password
    And I click on login button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"
