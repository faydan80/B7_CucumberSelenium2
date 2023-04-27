@dashboard
Feature: Dashboard Page Menu

  Scenario: As a user, I should be able to see the dashboard menu after log in
    Given The user is on the log in Page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to log in
    And The Welcome Message contains "Teacher"
    Then The user should be able to see submenu
      | Developers |
      | All Posts  |
      | My Account |

  Scenario: Log in as a specific user
    Given The user is on the log in Page
    When The user logs in with the following credentials
      | userName | eurotech@gmail.com |
      | password | Test12345!         |
      | message  | Teacher            |
    Then The user should be able to log in
    And The user should be able to see submenu
      | Developers   |
      | All Posts   |
      | My Account |

  Scenario: As a user, I should be able to see the editAdd menu on dashboard page
    Given The user is on the log in Page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to log in
    And The Welcome Message contains "Teacher"
    Then The user should be able to see editAdd menu
      | Edit Profile |
      | Add Experience  |
      | Add Education |



