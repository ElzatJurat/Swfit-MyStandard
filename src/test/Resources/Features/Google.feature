Feature: GOogle search
  @login
  Scenario: User should be able to search for anything
    Given User should be on google homepage
    When User clicks search field and types spoon
    Then all spoons result should display