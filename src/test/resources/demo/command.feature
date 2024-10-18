Feature: Command Ordering
  as a customer, I want to command for someone

  Scenario: Creation of an empty Command
    Given Customer who want to command stuff for someone : "Toto"
    When a Command is made for someone
    Then there is no product in the Command
    And the command come from Customer

  Scenario: Creation of an empty Command
    Given Customer who want to command stuff for someone : "Toto"
    When a Command is made for someone
    Then there is no product in the Command
    And the command come from Customer