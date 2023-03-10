Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page
    #Given the user logged in with username as "librarian11@library" and password as "libraryUser"
    #Given the user logged in with username as "librarian12@library" and password as "libraryUser"
@try
  Scenario Outline: Verify login with different user types
   Given the user logged in with username as "librarian11@library" and password as "libraryUser"
    When User is on the Dashboard page
    Then User sees "usersBox" next to Dashboard and Books
    And User clicks "usersBox" button
    Then User sees "User ID"
    Then User clicks "searchBox"
    Then User types "<searchValue>" in to the search box
    Then User sees "<expectedUserId>" in the User Id column



    Examples:
      |searchValue         |expectedUserId|
      |Dannia Mayls        |    7585      |
      |tester11@test.com   |    7551      |
      |test-rauf5@test.com |    7541      |


  Scenario Outline: Verify login with different user types
    Given the user logged in with username as "librarian12@library" and password as "libraryUser"
    When User is on the Dashboard page
    Then User sees "usersBox" next to Dashboard and Books
    And User clicks "usersBox" button
    Then User sees "User ID"
    Then User clicks "searchBox"
    Then User types "<searchValue>" in to the search box
    Then User sees "<expectedUserId>" in the User Id column



    Examples:
      |searchValue         |expectedUserId|
      |Dannia Mayls        |    7585      |
      |tester11@test.com   |    7551      |
      |test-rauf5@test.com |    7541      |

  Scenario Outline: Verify login with different user types
    Given the user logged in with username as "librarian13@library" and password as "libraryUser"
    When User is on the Dashboard page
    Then User sees "usersBox" next to Dashboard and Books
    And User clicks "usersBox" button
    Then User sees "User ID"
    Then User clicks "searchBox"
    Then User types "<searchValue>" in to the search box
    Then User sees "<expectedUserId>" in the User Id column



    Examples:
      |searchValue         |expectedUserId|
      |Dannia Mayls        |    7585      |
      |tester11@test.com   |    7551      |
      |test-rauf5@test.com |    7541      |

   # @st1
  #Scenario: Verify login with different user types
  #  Given the user logged in with username as "student11@library" and password as "libraryUser"
  #  When User is on the Dashboard page
  # Then User sees "usersBox" next to Dashboard and Books

    #  @st2
  # Scenario: Verify login with different user types
  #  Given the user logged in with username as "student12@library" and password as "libraryUser"
  #  When User is on the Dashboard page
  # Then User sees "usersBox" next to Dashboard and Books



























