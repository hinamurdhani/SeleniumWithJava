#Author : Hina Murdhani
#@SmokeScenario
Feature: feature to test login functionality

#	@SmokeTest
  Scenario: Check login is successfull with valid creds
    Given user is on login page
    When user enter login name and password
    And clicks on login button
    Then user is navigated to home page

  #Scenario Outline: Check login is successfull with valid creds
    #Given user is on login page
    #When user enter login <name> and <password>
    #And clicks on login button
    #Then user is navigated to home page
#
    #Examples: 
      #| name  | password |
      #| user1 | pass1    |
      #| user2 | pass2    |
