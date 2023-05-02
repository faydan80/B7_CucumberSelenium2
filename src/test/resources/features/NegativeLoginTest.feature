@invalid
Feature: Negative Login Test

  Background:
    Given The user is on the log in Page
@smoke
  Scenario Outline:
    When The user logs in using "<userName>" and "<password>"
    Then The user shouldn't be able to log in
    And The warning message contains "<expectedMessage>"
    Examples:
      | userName          | password   | expectedMessage |
      | eurotech@gmail.co | Test12345! | Teacher |
      | euroteh@gmail.com | Test12345! | Teacher |
      | eurotech@a.com    | Test12345! | Teacher |
      | euotech@gmail.com | Test12345! | Teacher |
      | 12345@gmail.com   | Test12345! | Teacher |
