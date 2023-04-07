Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then User should login successfully


