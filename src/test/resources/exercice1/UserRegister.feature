Feature: Customer registration

  Scenario: Register a new user
    Given A new user want to create an account
    When a user send is "toto@test.com" "toto" and "password"
    And the new user is add to the app
    Then there is a message who validate Register

  Scenario: Register a user already exist
    Given A new user want to create an account
    When a user send is "toto@test.com" "toto" and "password"
    Then the user already exist error thrown

