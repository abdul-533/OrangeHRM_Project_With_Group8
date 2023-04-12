Feature: Entering the password less
 Background:
   Given Navigate to OrangeHRM
   When Enter valid username  as "Admin" and password as "admin123" and click login button
   Then User should login successfully

  Scenario: Entering the password less than 8 characters
    And Navigate to admin page
    When Click ADD button and enter the less password
    Then The error message should be displayed