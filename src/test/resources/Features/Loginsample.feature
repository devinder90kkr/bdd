#Author 
#Date
#Description

@SmokeFeature
Feature: User Login As a registered user , I want to login to the website.So that I can access my account
  
  @Smoketest
  Scenario:  Successful login with valid credentials
  
  Given Brower is open
  And the user is on login page
  When user enter username and password
  And the user click on Login button
  Then the user should be redirected to the homepage
 