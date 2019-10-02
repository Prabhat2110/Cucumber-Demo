Feature: Creating a valid order
  A functionality to check if valid order is created

  Scenario: Valid order created
    Given  A trader wants to create an order
    When   He wants to buy 350 "Experian" shares at 2500
    Then   A valid order should be created
