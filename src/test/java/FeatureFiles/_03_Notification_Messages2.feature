Feature: Password field which doesn’t have lower case character.
  Scenario: See notification messages displayed

    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then Navigate to Admin page
    Then User a AdminPassword name as "asd13145;"
    And Upper case message should be displayed