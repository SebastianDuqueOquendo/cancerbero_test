@Author:Neiver_Tapia

  Feature: Login in the application

    Background:
      Given User install or init the application

    Scenario: User login with valid credentials
      When User enters valid username and password
      And Clicks on login button
      Then User is navigated to the home page

