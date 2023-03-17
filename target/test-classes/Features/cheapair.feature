#This is new feature file
Feature: This feature is to test cheapAir page

Scenario: This scenario is to find the Lowest Prize economy flight and book tickets

Given Launch Browser and Load URL
When Enter itinerary details
And Add number of Passengers
Then Search for flights
And select the lowest prize from list
And Enter pasenger and payment details and submit


#Scenario: This scenario is to find Highest prize Business Class flight and book Ticktes.