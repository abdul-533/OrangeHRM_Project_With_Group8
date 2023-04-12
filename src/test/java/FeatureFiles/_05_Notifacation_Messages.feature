Feature:
  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully

  Scenario: Enter the invalid admin name in the Employee name field
    And Navigate to admin page
    When Click ADD button and enter the invalid admin name
    Then Warning messages should be displayed