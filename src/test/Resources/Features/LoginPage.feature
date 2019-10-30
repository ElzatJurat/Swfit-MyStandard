@login
Feature: LoginPage

  Background:
    Given User is on login page


  Scenario: Login as registered user
    When User logs in using "juratelzat@gmail.com" and "Daohaoqusi!@#4"
    Then two-step verifacation page should be displayed
    And User get step verifaction code from email and Enter verifacition code
    Then Registered user homepage should be displayed
    And User Profile name should be "elzat zayir"
