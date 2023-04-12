Feature: Verify red msg functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully
    When I navigate to Admin,User Management page
    And I click on Add button

  Scenario: Notification message when pressing save button without entering mandatory fields.
    And  click to save button
    Then Red notification message should be displayed
