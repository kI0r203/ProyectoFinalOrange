Feature: Maintenance OrangeHRM

  Background:User searching for Alice employee
  Given I am in orange web page

  @GoToMaintenance
  Scenario: From Dashboard go to Maintenance
    Given I set the user name field with "Admin"
    And I set the password field with "admin123"
    When I click on the login button
    Then The DashBoard should be displayed
    And I click on the Maintenance
    And I set the password "admin123"
    And I click on the Confirm button
    Then We should be the page of Maintenance
    And I click on drop down
    Then I click on logout button

