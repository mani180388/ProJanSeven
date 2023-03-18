Feature: this feature is to test the flight booking website
Scenario: this scenario is to test home page of cheapair website
Given launch the browser and load url
When  enter the flight and passenger count 
#Then validate the given details


Scenario: this scenario is to test the ticket price page
When  click on the lowest fare flight and continue
#Then validate the given details

Scenario: this scenario is to test the passenger details page
When  enter the passenger details  
#Then validate the given details

Scenario: this scenario is to test the payment page
When  enter the card details for payment
Then validate the given details
