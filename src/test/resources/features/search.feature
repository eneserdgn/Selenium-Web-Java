@SearchPage
Feature: Google Search Page

  @Searchbox
  Scenario: Should See Search Box
    Given I am on the Search Page
    Then I should see search box on Search Page

  @Listbox
  Scenario: Should See List Box
    Given I am on the Search Page
    When I enter "OpenAI" in the search box on Search Page
    Then I should see listbox on Search Page

  @Search @ResultPage
  Scenario: Search anyting on Google
    Given I am on the Search Page
    When I enter "OpenAI" in the search box on Search Page
    And I click "Google'da Ara" button on Search Page
    Then I should see the Result Page