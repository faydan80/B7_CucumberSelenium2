@account
Feature:Account Type

  Background:
    Given The user is on the log in Page

  Scenario: As a user,I should be able to login as a Teacher
   # Given The user is on the log in Page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to log in


  Scenario: As a user, I should be able to log in as a Student
   # Given The user is on the log in Page
    When The user logs in using "EurotechB4@gmail.com" and "Test1234"
    Then The Welcome Message contains "EurotechB4"

  Scenario: As a user, I should be able to log in as a Developer
   # Given The user is on the log in Page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The Welcome Message contains "Jack Bauer"


  Scenario Outline: Different user credentials
    When The user logs in using "<userType>" and "<password>"
    Then The Welcome Message contains "<text>"
    Examples:
      | userType              | password   | text          |
      | eurotech@gmail.com    | Test12345! | Teacher       |
      | EurotechB4@gmail.com  | Test1234   | EurotechB4    |
      | jackbauer@gmail.com   | Admin123   | Jack Bauer    |
      | Roma@gmail.com        | Test1234   | Roma          |
      | alex@gmail.com        | Test.123   | Alex          |
      | glgn_feyman@gmail.com | glgn123    | Gulgun Feyman |

