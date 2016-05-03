Feature: Task1
  As user
  I want to be able to add items into the basket

  Background:
    Given Browser is opened

Scenario: Add all items to the basket
  Given I am on Task "1" page
  When I add all products into the basket
  Then All products will be in the basket
  And Sum of quantity and price is correct


