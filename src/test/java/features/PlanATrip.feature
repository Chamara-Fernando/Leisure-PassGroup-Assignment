Feature: As Customer who wants to visit the attractions in Boston,
         I want to get the Explorer guidebook from www.gocity.com

  Scenario: As user I want to get the Explorer guidebook
    Given I am on the gocity website
    When I click on plan your trip link
    And I enter the first name, last name, email, travel date
    And I click on the privacy policy check box to agree to terms
    And I click on the submit button
    Then My request should be submitted