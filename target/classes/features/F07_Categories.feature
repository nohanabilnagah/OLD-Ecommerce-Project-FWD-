@smoke
Feature: Logged user could select different Categories

  Scenario: Logged user could random category and open Sub-Category
    Given user navigates to login page
    And user login with valid email and password
    When logged user selects Apparel Category and hover to open Shoes sub-Category
    And logged user could find Shoes products
