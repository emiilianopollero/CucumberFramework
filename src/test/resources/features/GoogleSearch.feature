Feature: Google search

  Scenario: Search a word and see that it shows up on the results
    Given I navigate to Google homepage
    When I search for "clapi"
    Then I can see in the results the word "clapi"