Feature: User Login
  As a registered user, I want to login to the website so that I can access my account

  @Smoketest
  Scenario: Advocate logs in with valid credentials
    Given Browser is open
    And the user is on login page
    When user enters advocate login credentials from config file
    And the user clicks on Login button
    Then the user should be redirected to the homepage

  @Smoketest
  Scenario: Coach logs in with valid credentials
    Given Browser is open
    And the user is on login page
    When user enters coach login credentials from config file
    And the user clicks on Login button
    Then the user should be redirected to the homepage

  @Smoketest
  Scenario: Doctor logs in with valid credentials
    Given Browser is open
    And the user is on login page
    When user enters doctor login credentials from config file
    And the user clicks on Login button
    Then the user should be redirected to the homepage
