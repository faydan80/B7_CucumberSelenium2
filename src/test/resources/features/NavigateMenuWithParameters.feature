@navigate_p
Feature:Navigate to Menu with parameters

  Background:
    Given The user is on the log in Page

  Scenario: User should be able to navigate to Developers Menu
   # Given The user is on the log in Page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to log in
    And The Welcome Message contains "Teacher"
    Then The user navigates to "Developers" Menu
    And The user should be able to see the header as "Filter Profiles by Skill or by Location"

  @posts
  Scenario: As a student I should be able to Navigate to Post Menu
  #  Given The user is on the log in Page
    When The user logs in using "EurotechB4@gmail.com" and "Test1234"
    Then The Welcome Message contains "EurotechB4"
    And The user navigates to "All Posts" Menu
    Then The user should be able to see the header as "Posts"

  @developer_p
  Scenario: As a Developer I should be able to Navigate to Post Menu
    #Given The user is on the log in Page
    When The user logs in using "jackbauer@gmail.com" and "Admin123"
    Then The Welcome Message contains "Jack Bauer"
    And The user navigates to "My Account" Menu
    Then The user should be able to see the header as "Dashboard"
@smoke
  Scenario Outline: Navigate Menu Different Credentials
    When The user logs in using "<userName>" and "<password>"
    Then The Welcome Message contains "<text>"
    And The user navigates to "<menu>" Menu
    Then The user should be able to see the header as "<headerText>"

    Examples:
      | userName             | password   | text       | menu       | headerText                              |
      | eurotech@gmail.com   | Test12345! | Teacher    | Developers | Filter Profiles by Skill or by Location |
      | EurotechB4@gmail.com | Test1234   | EurotechB4 | All Posts  | Posts                                   |
      | jackbauer@gmail.com  | Admin123   | Jack Bauer | My Account | Dashboard                               |