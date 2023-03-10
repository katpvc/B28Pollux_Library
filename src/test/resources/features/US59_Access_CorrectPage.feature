@regression
Feature: Library login feature

  User Story"
  As a user , I should be able to login with correct credentials to different accounts,And dashboard Accounts are :Librarian ,student


  Background: For all scenario user is on the page of the library application



  @librarian @smoke
  Scenario: Login as librarian

    When user enters librarian username"username"
    And  user enter librarian password"password"
    Then user should see the dashboard




  @student @smoke
  Scenario: Login as student
    When user enters student username"username"
    And  user enter  student password"password"
    Then user should see the dashboard