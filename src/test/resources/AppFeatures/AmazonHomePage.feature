Feature: Amazon Home Page
 In order to test Amazon Home page of application
 As a registered user
 I want to specify the features of home page
 
 Scenario: Home Page Top Panel Section
 Given User is on Amazon Home Page
 Then User gets a Amazon search field
 And username is also displayed next to search field
 And Amazon logo is also displayed
 And Cart link is also displayed
 
 Scenario: Amazon Today's Deals Section
 Given User is on Amazon Home Page
 When User scrolls down to Todays Deals section
 Then user gets the list of multiple products
 And user gets product image and price details
 And user can see more products by clicking on carousel
 
 Scenario: Amazon Footer Links Section
 Given User is on Amazon Home Page
 When User scrolls down to footer of the page
 Then user gets all Country links
 |Australia |
 |Brazil |
 |China |
 And user gets all Amazon services links
 |Amazon Business|
 |Amazon Web Services|
 And user gets all privacy policy links
 |Privacy Notice|
 |Use & Sale|
 
 