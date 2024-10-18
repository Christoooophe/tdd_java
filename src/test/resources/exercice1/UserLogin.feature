Feature: User try to connect

  Scenario:
    Given User who want to connect
    When User attempt to connect
    Then User access connection form

  Scenario:
    Given User who want to connect
    When User attempt to enter his informations
    Then Accept if not empty

  Scenario:
    Given User who want to connect
    When User give bad infos
    Then User get error

  Scenario:
    Given User who want to connect
    When User give good username and password
    Then User access homepage
