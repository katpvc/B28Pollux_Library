Feature: Users should have unique id's

  Scenario: User page verification
    Given User is on the Dashboard page
    When User sees "Users" next to Dashboard and Books
    And User clicks "Users" button
    Then User sees "User ID"