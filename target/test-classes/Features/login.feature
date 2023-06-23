Feature: Eurotech Login Test



  Scenario: Login As Teacher
    Given The user is on the login page
    When The user logs in using "nhntsc@gmail.com" and "N12345!" credentials
    Then  The user should be able to login