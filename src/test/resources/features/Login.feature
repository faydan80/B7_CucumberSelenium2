@Login @smoke
Feature: DevEx log in test

  #@teacher
  @teacher
  Scenario: Log in as a teacher
    Given The user is on the log in Page
    When The user enters the teacher credentials
    Then The user should be able to log in

 #@student
  @student
  Scenario: Log in as a student
    Given The user is on the log in Page
    When The user enters the student credentials
    Then The user should be able to log in

  @SDET
    #As a developer
  Scenario: Log in as a developer
    Given The user is on the log in Page
    When The user enters the developer credentials
    Then The user should be able to log in

 # @SDET
    #As an SDET
#  Scenario: Log in as an SDET
  #  Given The user is on the log in Page
   # When The user enters the SDET credentials
   # Then The user should be able to log in

