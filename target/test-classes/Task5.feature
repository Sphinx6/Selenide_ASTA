Feature: Task5
  As user
  I want to upload text file

  Scenario: Upload file with data
    Given I am on Task "5" page
    And file with data is prepared
    When I upload file
    Then Imported data are correct