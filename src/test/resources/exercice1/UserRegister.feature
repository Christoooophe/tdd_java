Feature: User registration

  Scenario: User access register form
    Given User who want to register
    When a User want to register
    Then User can access to register page

  Scenario: User enter infos
    Given User who want to register
    When a User want to register
    Then User give his informations

  Scenario: User account create
    Given User who want to register
    When all User informations are here
    Then User get confirm

  Scenario: Error while creating account
    Given User who want to register
    When a username already exist
    Then User get error
