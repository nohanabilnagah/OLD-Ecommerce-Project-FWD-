@smoke
Feature: Logged user could select different tags

  Scenario: Logged could select product tags
    Given user navigates to login page
    And user login with valid email and password
    And logged user clicks on search field
    When logged user searches with name of product
    And user selects a product

    Then user could select different tags
    And logged user could find new products

    Then user could select another Popular tag
    And logged user could find new products