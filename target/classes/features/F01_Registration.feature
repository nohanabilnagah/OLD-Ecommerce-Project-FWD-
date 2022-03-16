@smoke
Feature: F01_Registration | New user could register

  Scenario: new user could register with valid data
    Given new user launch registration page
    When new user fills registration form with valid data
    And new user could register
    Then a success message is displayed
