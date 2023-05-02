@navigate
Feature: Navigation Menu Test
@developer
  Scenario: Navigate to Developers Menu
    Given The user is on Login Page
    When The user enters the teacher credentials
    Then The user gets the Welcome text
    And The user navigates to Developers Menu
    Then The user gets the Developers Text
@student @wip
  Scenario: Navigate to Student Menu
    Given The user is on Login Page
    When The user enters the student credentials
    Then The user gets the Welcome text
    And The user navigates to All Posts Menu
    Then The user gets the Posts text
@teachers
    Scenario: Navigate to Teacher Menu
      Given The user is on Login Page
      When The user enters the teacher credentials
      Then The user gets the Welcome text
      And The user navigates to My Account Menu
      Then The user gets the Dashboard text