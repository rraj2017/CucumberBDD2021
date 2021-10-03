Feature: User Registration

Scenario: user registration with different data
 Given User is on registration page
 When User enters following user details
   | naveen | automation | nav@gmail.com | 99999 | Bangalore |
   | tom | Peter | tom@gmail.com | 88788 | London |
   | lisa | dsouza | lisa@gmail.com | 7888788 | SFO |
   Then user registration should be successful

   Scenario: user registration with different data with columns
 Given User is on registration page
 When User enters following user details with columns
   | firstName | lastName | email | phoneNo | city |
   | naveen | automation | nav@gmail.com | 99999 | Bangalore |
   | tom | Peter | tom@gmail.com | 88788 | London |
   | lisa | dsouza | lisa@gmail.com | 7888788 | SFO |
   Then user registration should be successful