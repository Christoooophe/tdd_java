Feature: Customer Login

  En tant qu'utilisateur je veux me connecter à mon compte

  Scenario: Login a user
    Given A User try to connect
    When A User send is "root" and "root"
    And the User is log to the app
    Then there is a message of validation

  Scenario: Login a user who not exist
    Given A User try to connect
    When A user send is "bat" and "root"
    Then there is an error messsage

  Scenario: Login a user with wrong password
    Given A User try to connect
    When A User send is "root" and bad password "zzz"
    Then there is an error for the password