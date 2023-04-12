Feature: Verify functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully

  Scenario: Verify that all the required elements are displayed
    When I navigate to Admin,User Management page
    And I click on Add button
    And I verify that all the required elements are displayed