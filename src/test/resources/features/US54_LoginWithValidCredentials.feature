Feature: User valid login
  Agile story: As a user, I should be able to Login with valid credentials.

  @eka
  Scenario Outline: Verify user information <email>
    Given User is on the login page
    When User login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @students
    Examples:
    | email             | password    | name            |
    | student27@library | libraryUser | Test Student 27 |
    | student28@library | libraryUser | Test Student 28 |
    | student29@library | libraryUser | Test Student 29 |
    | student30@library | libraryUser | Test Student 30 |


    @librarians
    Examples:
    | email               | password    | name              |
    | librarian13@library | libraryUser | Test Librarian 13 |
    | librarian14@library | libraryUser | Test Librarian 14 |
    | librarian15@library | libraryUser | Test Librarian 15 |
    | librarian16@library | libraryUser | Test Librarian 16 |
