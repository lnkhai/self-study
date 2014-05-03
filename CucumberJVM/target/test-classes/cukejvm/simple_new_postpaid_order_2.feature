#Feature: Testing driver

#  Scenario: Create New Postpaid Mobile Plan Order
#    Given customer want to make New Postpaid Order
#    When customer open Postpaid Explore page
#    And select offer with code "116398-tso_ma-55-24"
#    And customer click "Next" at "What you need to order" module
#    And customer select memory size 32GB and Grey color at "Customise Device" module
#    And customer select no extra SIM at Shared Data form

#  Scenario: Create New Postpaid BYO Plan Order
#    Given User want to buy a Postpaid Mobile Plan Order
#    Then User goes to Postpaid Shop
#    And User select an offer
#    And User fill in all required information
#    When User submit the order
#    Then the order should finish successfully
#    And Customer should see confirmation info
#    And Customer should see the confirmation email
#
#  Scenario: Create Recontract Postpaid Plan Order
#    Given User want to buy a Postpaid Mobile Plan Order
#    Then User goes to Postpaid Shop
#    And User select an offer
#    And User fill in all required information
#    When User submit the order
#    Then the order should finish successfully
#    And Customer should see confirmation info
#    And Customer should see the confirmation email