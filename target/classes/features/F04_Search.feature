@smoke
Feature: Logged user could search for any product on the website

  Scenario: Logged user could search for product name
    Given user navigates to login page
    And user login with valid email and password
    When logged user clicks on search field
    And logged user searches with name of product
    Then logged user could find relative results
