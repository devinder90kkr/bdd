#Author 
#Date
#Description

@SmokeFeature
Feature: feature to test google search
  
  @Smoketest
  Scenario: Validate google search is working
  
  Given brower is open
  And user is on google search page
  When user enter a text in search box 
  And hits enter
  Then user is navigated to search results