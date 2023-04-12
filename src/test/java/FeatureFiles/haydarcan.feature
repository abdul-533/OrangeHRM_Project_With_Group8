Feature:  Verifying mandatory field notification messages

  Background:
    Given Navigate to OrangeHRM
    When Enter valid username  as "Admin" and password as "admin123" and click login button
    Then Navigate to Admin page
    And Click on Add button
    And Click Save button


  Scenario: Verify that "Already exists" notification messages are displayed in red.


    And enter a value in to the username which was already taken

    Then Verify Already Exists in red color message
