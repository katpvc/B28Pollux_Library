Feature: search new users dialog
  Agile Story: User should be able to search users by ID

  @wip
  Scenario: Verify user information
    Given user is on the login page
    And user login using following credentials
      | email    | librarian21@library |
      | password | libraryUser         |

    And user click on "Users"link
    When user search for "7587"
    Then user should see table containing the below data

      | User ID   | 7587                            |
      | Full Name | Asuncion Pfeffer                |
      | Email     | OraliaDaugherty2345@library.com |