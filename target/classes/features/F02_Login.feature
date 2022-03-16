@smoke
Feature: F02_Login | user could use login functionality to open his account

  Scenario: user could login with valid email and password
    Given user navigates to login page
    When user login with valid email and password
    And user press on login button
    Then user could login successfully