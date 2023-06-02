Feature: Validate Locations functionality

  Scenario Outline: Verify if user is able to select state
    Given I am on the Locations page
    When I enter "<locality>" in location input box
    And I select "<locality>" and "<province>"
    Then I should be able to see location highlighted on map

    Examples: 
      | locality | province |
      | Texas    | state    |
