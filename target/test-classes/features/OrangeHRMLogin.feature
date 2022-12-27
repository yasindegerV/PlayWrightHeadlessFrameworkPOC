Feature: Login Scenarios

  Background:
    Given "https://google.com" sitesini aç.
    Then Login syfasında olduğunu doğrula.

  Scenario: OrangeHRM Login Scenario
    And Enter username as "Admin"
    And Enter password as "admin123"
    And Click Login button
    Then Verify on login page