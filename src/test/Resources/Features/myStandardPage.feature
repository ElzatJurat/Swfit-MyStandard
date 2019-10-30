@MyStandard
Feature: MyStandard Homepage

  Background:
    Given User is on login page



  Scenario:  Confirm myStandard HomePage
    When User logs in using "juratelzat@gmail.com" and "Daohaoqusi!@#4"
    Then two-step verifacation page should be displayed
    And User get step verifaction code from email and Enter verifacition code
    Then Registered user homepage should be displayed
    And user clicks on mySWIFT tab
    Then mySWIFT page should be displayed
    And user clicks on My tools dropdown
    And User clicks on MyStandards
    Then MyStandard page should be displayed