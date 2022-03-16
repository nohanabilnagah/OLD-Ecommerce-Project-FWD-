@smoke
Feature: F03_ResetRassword | user could reset his password

  Scenario: user reset his password successfully
    Given user is on the login page
    When user clicks on forgot password
    And user enters his email address to reset password
    Then user clicks on recover button
    And user gets a displayed message


