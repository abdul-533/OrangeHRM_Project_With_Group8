Feature: USER ADD
  Background: Login and Check
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully
    When I navigate to Admin,User Management page
    And I click on Add button
    Scenario:
      And enter a value in to the username which was already taken
      Then verify that notification messages “Already exists” in red color displayed.

