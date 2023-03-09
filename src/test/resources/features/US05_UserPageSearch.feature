@kursad
Feature: Search functionality on the users page

  Background:
    Given the user is on the login page
    And the user logged in as "librarian"


  Scenario: Search accuracy
    And user click on Users link
    When user search for "test"
    Then table should contain rows with "Test"

  Scenario: Table columns names
    And user click on Users link
    When user search for "test"
    Then table should have following column names
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |