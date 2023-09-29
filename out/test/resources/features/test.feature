Feature: Endpoint automation succesfull
  I as user
  I need to consume the api back
  to validate a successful response


  Scenario: Successful consumption
    Given the user needs a request
    When the user requests the list of apis
    Then the user will see the successful code