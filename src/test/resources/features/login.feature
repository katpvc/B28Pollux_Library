@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
#    Given the user logged in as "student"
    Given the user logged in as "librarian"
#    Given the user logged in with username as "student11@library" and password as "libraryUser"





