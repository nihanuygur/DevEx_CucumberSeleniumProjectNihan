Feature: post to community


  Scenario Outline: As a user, I should be able to post to community.(with All Post menu)
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then  The user should be able to login
    And The user navigates to  "All Posts" menu
    And The user fills Add a title fields as "<addTitle>" and Create a post field as "<createPost>"
    Then The user should see "Post Created" message
    Examples:
      | addTitle  | createPost        |
      | firstPost | Hello from Batch6 |
      | @         | second            |

  @wip
  Scenario Outline: As a user, I should not be able to post with empty blanks.
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then  The user should be able to login
    And The user navigates to  "All Posts" menu
    And The user fills Add a title fields as "<addTitle>" and Create a post field as "<createPost>"
    Then The user should see "<message>" error message
    Examples:
      | addTitle | createPost | message                     |
      |          |            | Please fill out this field. |
      |          | Hello      | Please fill out this field. |
      | Hello    |            | Please fill out this field. |
      | Hello    | hi         | Post Created                |


  Scenario Outline: As a user, I should be able to post to community.(with My Post menu)
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then  The user should be able to login
    And The user navigates to  "My Post" menu
    And The user fills Add a title fields as "<addTitle>" and Create a post field as "<createPost>"
    Then The user should see "Post Created" message
    Examples:
      | addTitle  | createPost        |
      | firstPost | Hello from Batch6 |


  Scenario : As a user, I should be able to see my posts in Posts page.
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then  The user should be able to login
    And The user navigates to  "My Post" menu
    And The user should see previous messages with edit icon
    Then The user should click to edit button
