Feature: Task3
  As user
  I want to edit a form

  Scenario: Edit form
    Given I am on Task "3" page
    When I start edit mode
    And I change data in form
    And I click save button
    Then Success message is shown
    And Entered data are saved


