Feature: Filter competition postings

Scenario: 21. Filter competition postings based on driver type, position, and location radius
    Given I am on the competition page
    Then I click on Solo Team Header
    And I select Solo or Team Position as Team
    Then I clear by defualt filter Last Month
    And I click on the search by radius
    Then I enter the radius "100" miles
    When I enter in radius location as "<locality>" in location input box
    And I select radius "<locality>" location and "<province>"
    And I click the green check mark
    Then I verify that at least one county is selected
    And I click the accept button
    Then I click on Search Button
    Then I take a screenshot for Scenario 21
            Examples: 
      | locality | province |
      | California  | United States |