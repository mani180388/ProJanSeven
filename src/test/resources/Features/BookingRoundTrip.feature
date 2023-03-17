Feature: Booking a Round Trip in Cheap Air site

  Scenario: Launching the browser and URL
    Given Launch the chrome browser
    When Navigate to the Cheap Air web application
    Then Confirm the site is launched

  Scenario: Searching Flights for trip
    Given Select the FROM, TO and Pick the Departure and Arrival dates
    When Select the passengers count and travel seat type
    Then Search for flights
    And Check window for showing prices

  Scenario: Selecting flight tickets with low price
    Given Sort the prices of flight tickets
    When Select the low price flights for round trip
    Then Check the total fare    
    And Continue to passenger detail page
    
    Scenario: Passenger details and purchase options
    Given Enter the passenger details
    When Enter the purchase details
    Then Verify the purchse button
