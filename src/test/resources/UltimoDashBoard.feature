Feature: DashBoard OrangeHRM

  Background:User searching for Alice employee
    Given I am in orange web page

    @goToHelpPage
    Scenario: Click on the help button and should go to Help page
      Given I set the user name field with "Admin"
      And I set the password field with "admin123"
      When I click on the login button
      Then The DashBoard should be displayed
      And I click on the Help button
      Then The title of Help page should be displayed