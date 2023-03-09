@regression
Feature: manage user info table
  User story: As a user , I want to change the number of rows to see the user info

  Background: User is already in the log in page


  Scenario: Change number of rows in Users page
    Given I login as a librarian
    And I click on "Users" link
    When I select Show 50 records
    Then show records value should be 50
    And the users table must display 50 records
