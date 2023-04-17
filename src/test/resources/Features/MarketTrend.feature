Feature: Validate prior 3 months functionality on Market Trends Page

  Scenario: Verify if user is able to select driver type as Overall and timeframe as prior 3 months
    Given I am on the market trends page
    When I set the driver type field to "Overall"
    And I set the timeframe field to "Prior 3 months"
    Then Click on RunSearch Button
    Then Get the page Title

  Scenario: Verify if user is able to click on market trends, locations, competition, question mark and admin
    Given I am on the market trends page
    Then Click on Location page
    Then Click on Competition Page
    Then Get the page Title
