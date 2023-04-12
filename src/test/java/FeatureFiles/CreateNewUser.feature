Feature: Creating a New User Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully

  Scenario: User will create a new user and check the username and password is valid
    And Click on the Admin from leftnav
    And Click add button and fill in the informations
    And Click Save button
    Then Verify the new user is in the list
