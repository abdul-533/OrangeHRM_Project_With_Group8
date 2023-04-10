Feature: Add User

  Background:
    Given Navigate to OrangeHRM
    When Login as default informations
    And Click on the Admin from leftnav

  Scenario: Check Add user is displayed
    And Click on Add button
    Then Check add user is displayed