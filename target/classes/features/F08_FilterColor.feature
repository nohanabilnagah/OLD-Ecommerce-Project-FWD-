@smoke
Feature: Logged user could filter with color

  Scenario: Logged user could filter shoes with color
    Given user navigates to login page
    And user login with valid email and password
    When logged user selects Apparel Category and hover to open Shoes sub-Category

    Then logged user could filter shoes with color