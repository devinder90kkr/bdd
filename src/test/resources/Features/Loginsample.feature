#Author
#Date
#Description
@SmokeFeature
Feature: User Login As a registered user , I want to login to the website.So that I can access my account

  @Smoketest
  Scenario Outline: Successful login with valid credentials
    Given Brower is open
    And the user is on login page
    When user enter <email> and <password>
    When the user click on Login button
    Then the user should be redirected to the homepage

    Examples: 
      | email                   | password |
      | markcuesz90@yopmail.com  | User!234 |
