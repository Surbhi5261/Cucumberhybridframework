
Feature: Production login testcase
   
  @sanity
  Scenario: user Successful login with valid credentials
    Given user on login page
    And   user will click the login button
    Then  user should be logged in to the account
    
    
 