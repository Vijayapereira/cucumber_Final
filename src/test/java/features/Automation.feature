@LoginFeature
Feature: Background color validation

@Scenario1
Scenario: 1 Sky Blue Background Is Visible
Given Set Sky Blue Background Button exists
When I click on the button
Then The background color will change to sky blue

@Scenario2
Scenario: 2 White Background Is Visible
Given Set Sky White Background Button exists
When I click on that button
Then the background color will change to white

