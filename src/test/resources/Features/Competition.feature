Feature: Filter competition postings

  Scenario: 8. Filter competition postings based on driver type, position, and location radius
    Given I am on the competition page
    And I select Posting Driver Type as Student Driver
    Then I click on Solo Team Header
    And I select Solo or Team Position as Team
    And I click on the search by radius
    And I enter the radius 50 miles
    When I enter in radius location as "<locality>" in location input box
    And I select radius "<locality>" and "<province>"
    And I click the green check mark
    And I click the accept button
    Then I click on Search Button
   	Examples: 
      | locality | province |
      | Texas    | state    |
