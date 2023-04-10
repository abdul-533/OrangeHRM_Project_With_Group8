Feature: Creating a New User Functionality
  Scenario: User will create a new user and check the username and password is valid
    Given Navigate to OrangeHRM
    When Login as default informations
    And Click on the Admin from leftnav
    And Click add button and fill in the informations
    And Click Save button
    Then Verify the new user is in the list
