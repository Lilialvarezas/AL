Feature: Cart Management

  Scenario: Add a product with a price greater than 100
    Given an empty cart
    When I add a product "Laptop" with price 150
    Then the total should be 135
