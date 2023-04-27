@parameters
Feature: As a user I should be able to log in with different user credentials
  @teacher
  Scenario: Login as a teacher with parameters
    Given The user is on the log in Page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to log in
    And The Welcome Message contains "Teacher"
@student
    Scenario: Login as a Student with parametert
      Given The user is on the log in Page
      When The user logs in using "EurotechB4@gmail.com" and "Test1234"
      Then The user should be able to log in
      And The Welcome Message contains "EurotechB4"
