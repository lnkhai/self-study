1. To run a specific tag:
mvn test -Dcucumber.options="--tags @Development"

2. To rebuild and run all tests:
mvn test

3. To clean up build result:
mvn clean

4. To specify a tag in feature file:
Feature: Create a simple order in Postpaid Shop

  @Development
  Scenario: Create New Postpaid Mobile Plan Order
    Given this is a test drive