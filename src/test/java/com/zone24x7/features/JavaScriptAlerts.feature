Feature: Handle JavaScript Alerts on The Internet Herokuapp

  Scenario: Successfully Navigate to JavaScript Page and Click First JS Alert Popup
    Given I navigate to The Internet Herokuapp
    When I go to the "JavaScriptAlert" page
    Then I click the JS Alert button
    And I accept the alert popup

