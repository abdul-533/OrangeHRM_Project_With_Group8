Feature: Admin Password errror entry Functionality
  Scenario: See notification messages displayed

    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then Navigate to Admin page
    Then User a AdminPassword name as "ASD1314;" short name as "asd121315;"
    And Error message should be displayed
