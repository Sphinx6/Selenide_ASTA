Feature: Task2
  As user
  I want to filter products by group

  Scenario: Filter products by group
    Given I am on Task "2" page
    When I select "Sport" group
    Then Only products from "Sport" group will be visible


