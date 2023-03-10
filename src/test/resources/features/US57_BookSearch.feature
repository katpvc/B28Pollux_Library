@BookSearch
Feature:books search
Background: User is already in the log in page
 Given the user is on the login page


@flora
Scenario:As a user,I should be able to search a book
  Given I login to application as a student
  And I navigate to "Books" page
  And I search for "The Goldfinch"
  Then books table should contain results matching
  |ISBN    |387927210592 |
  |Name    |The Goldfinch|
  |Author  |Donna Tartt  |
  |Category|Fantasy      |
  |Year    |2013         |
