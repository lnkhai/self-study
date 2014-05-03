Feature: Create a simple order in Postpaid Shop

  @Development
  Scenario: Create New Postpaid Mobile Plan Order
    Given customer want to make New Postpaid Order
    When customer open Postpaid Explore page
    And select offer with code "116398-tso_ma-55-24"
    And customer click "Next" at "What you need to order" module
    And customer select memory size 32GB and Grey color at "Customise Device" module
    And customer select no extra SIM at Shared Data form
    And customer select Add-On with code:
      | addOnCode                   | addOnName         | addOnPrice |
      |vas-newphonefeeling-1000     | New Phone Feeling | 1000       |
      |vas-stayconnected-basic-1300 | StayConnected     | 1300       |
    And customer input their name and date of birth
#    And customer choose start (new|recontract|portin) order with Telstra
#    And customer input contact information
#    And customer input their home address
#    And customer input their delivery address
#    And customer input their residential status
#    And customer input identity information
#    And customer input occupation information
#    And customer select their preference billing
#    Then customer could see the summary of their selection
#    And customer input credit card information
#    Then customer could see the confirmation page


#    Given User want to buy a Postpaid Mobile Plan Order
#    Then User goes to Postpaid Shop
#    And User select an offer
#    And User fill in all required information
#    When User submit the order
#    Then the order should finish successfully
#    And Customer should see confirmation info
#    And Customer should see the confirmation email
