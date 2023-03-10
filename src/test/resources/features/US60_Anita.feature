@regression
Feature: Page navigation links
  User Story 12: as a librarian, I should be able to navigate to correct pages.


  Background:
    Given I am on the login page
    And I login as a librarian

    @users @smoke
  Scenario: Go to users page
    When I click on "Users" module
    Then "Users" page should be displayed

    @books @smoke
  Scenario: Go to users page
    When I click on "Books" module
    Then "Books" page should be displayed

    @dashboard @smoke
  Scenario: Go to dashboard page
    And I click on "Books" module
    When I click on "Dashboard" link
    Then "Dashboard" page should be displayed