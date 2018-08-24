Feature: Login

Scenario: Login  failed Relogin should appear
   Given that I am on login page
   When I enter username as usname
   And I enter password as pword
   Then I should relogin


Scenario: Login in failed Relogin should appear
   Given that I am on login page
   When I enter username as uname
   And I enter password as pword
   Then I should relogin
   
   Scenario: Login to account
   Given that I am on login page
   When I enter username as uname
   And I enter password as pword
   Then I should login