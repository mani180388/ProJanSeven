$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Peter Praveen/eclipse-workspace/CheapAir_WebApp_Junit/src/test/resources/Features/BookingRoundTrip.feature");
formatter.feature({
  "name": "Booking a Round Trip in Cheap Air site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launching the browser and URL",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefinition.launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to the Cheap Air web application",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDefinition.navigate_to_the_Cheap_Air_site_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the site is launched",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.confirm_the_site_is_launched()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching Flights for trip",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Select the FROM, TO and Pick the Departure and Arrival dates",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefinition.select_the_FROM_TO_and_Pick_the_Departure_and_Arrival_dates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the passengers count and travel seat type",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStepDefinition.enter_the_passenger_details_and_travel_seat_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for flights",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefinition.search_for_flights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check window for showing prices",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefinition.check_window_for_showing_prices()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Selecting flight tickets with low price",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Sort the prices of flight tickets",
  "keyword": "Given "
});
formatter.match({
  "location": "FlightSelectionStepDefinition.sort_the_prices_of_flight_tickets()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the low price flights for round trip",
  "keyword": "When "
});
formatter.match({
  "location": "FlightSelectionStepDefinition.select_the_low_price_flights_for_round_trip()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the total fare",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightSelectionStepDefinition.check_the_total_fare()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Continue to passenger detail page",
  "keyword": "And "
});
formatter.match({
  "location": "FlightSelectionStepDefinition.continue_to_passenger_detail_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Passenger details and purchase options",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Enter the passenger details",
  "keyword": "Given "
});
formatter.match({
  "location": "Passenger_Payement_Detail_StepDefinition.enter_the_passenger_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the purchase details",
  "keyword": "When "
});
formatter.match({
  "location": "Passenger_Payement_Detail_StepDefinition.enter_the_purchase_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the purchse button",
  "keyword": "Then "
});
formatter.match({
  "location": "Passenger_Payement_Detail_StepDefinition.verify_the_purchse_button()"
});
formatter.result({
  "status": "passed"
});
});