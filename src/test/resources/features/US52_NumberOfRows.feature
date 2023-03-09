
Feature: As a user, I want to select different number of raws to see users records

  @wip_Kakha
  Scenario Outline: Show records for "count" options

    Given I am on the login page
    And I login as a librarian
    And I click on Users link
    When I select Show "<count>" records
    Then show records value should be "<count>"
    And the users table must display "<count>" records


    Examples:
      | count |
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |
