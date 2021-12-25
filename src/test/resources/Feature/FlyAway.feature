@tagFlyAway
Feature: FlyAway Ticket Booking
  This would contain scenarios for FlyAway Ticket Booking
 

  @tag1
  Scenario: User opens Home Page
    Given user has opened Application
    When user opens Home page
    Then user should be navigated to home page
    

  @tag2
  Scenario: User Registration
    Given user has opened login page 
    And user opts to register
    When user enters details required
    Then user registered successfully
    
  @tag3
  Scenario: Login Page
    Given user opened login page and enter details
    When user clicks on login button
    Then user is on login page
    
    
  @tag4
  Scenario: Flight Ticket Booking
    Given user has logged successfully and clicks on home
    When Select "Bangalore" as source and "Hyderabad" as destination
    And User books flight
    Then User completes booking
    
  @tag5
  Scenario: View Booking Status 
    Given user complete booking
    Then user will check booking status
    And user logout
