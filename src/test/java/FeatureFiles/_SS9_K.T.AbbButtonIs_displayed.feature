Feature: Add button functionality
  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully

    Scenario: Verify that add button is displayed or not
      When I navigate to Admin,User Management page
      Then I get a success message that add button is displayed