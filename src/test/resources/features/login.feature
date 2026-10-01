Feature: Login

  Scenario: Login Successful
    Given he user have the ability to access the api
    When he send request to the login api
    Then he could see the response with status code 200



