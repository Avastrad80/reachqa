Feature: Validate prior 3 months functionality on Market Trends Page

  Scenario: Verify if user is able to select driver type and timeframe as Prior to 3 Months
    Given I am on the market trends page
    When I click on DriverType drop down list
    And I select the driver type field as "Other"
    And I click on TimeFrame DropDown
    And I select the timeframe field to "Prior 3 months"
    Then Click on RunSearch Button
    When I click on DriverType drop down list
    And I select the driver type field as "Team"
    And I click on TimeFrame DropDown
    And I select the timeframe field to "Prior 6 months"
    Then Click on RunSearch Button
