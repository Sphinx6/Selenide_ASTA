Feature: Task4
  As user
  I want apply for a job

  Background:
    Given Browser is opened

  Scenario: Fill apply form
    Given I am on Task "4" page
    When I click apply
    And I fill form
    And I click send button
    Then Success info is shown