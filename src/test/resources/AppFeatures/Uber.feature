@All
Feature: Uber Booking Feature

@Smoke
Scenario: Booking cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking SUV
Given User wants to select a car type "suv" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Prod
Scenario: Booking cab for Mini
Given User wants to select a car type "mini" from uber app
When User selects car "sedan" and pick up point "Pune" and drop location "Mumbai"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD