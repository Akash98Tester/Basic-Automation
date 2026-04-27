Feature: Login Feature

  Scenario: Valid login
    Given user opens the application
    When user enters credentials
    Then user should see homepage

  Scenario: Invalid login
    Given user opens the application
    When user enters invalid credentials
    Then error message should display