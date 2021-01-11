
Feature: Differnt Get Opereation Of Latest Foreign Exchange Rates

 
  Scenario: Verify that Rates API for Latest Foreign Exchange rates
    Given Rates API for Latest Foreign Exchange rates
    When The API is available
    Then An automated test suite	should run	which will assert the success status of the response
   

   Scenario:  Verify that response of Rates API for Latest Foreign Exchange rates
   Given Rates API for Latest Foreign Exchange rates
   When The API is available
   Then An automated test suite should run	which will assert the response
   
   
   Scenario:  Verify that correct response supplied by the call in Rates API for Latest Foreign Exchange rates
   Given Rates API for Latest Foreign Exchange rates
   When An incorrect or incomplete url is provided e.g: https://api.ratesapi.io/api
   Then Test case should assertthe correct response supplied	by the call
   
   Scenario:  Verify that Rates API for Specific date Foreign Exchange rate
   Given Rates API for Specific date Foreign Exchange rates
   When The API is available
   Then An automated test suite should run which will assert	the success	status of the response
   
    Scenario: Verify that response of Rates API for Specific date Foreign Exchange rate
   Given Rates API for Specific date Foreign Exchange rates
   When The API is available
   Then An automated test suiteshould run	which will assert the response
   
    Scenario: Verify that the response matches for the current date Rates API for Specific date Foreign Exchange rate
   Given Rates API for Specific date Foreign Exchange rates
   When A future date is provided in the url
   Then An automated test suite	should run which will validate that the response matches for the current date
   
    