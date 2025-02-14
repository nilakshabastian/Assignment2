Feature: Handle iframe on The Internet Herokuapp Web App

  Scenario: Successfully Navigate to Frame Page and Navigate to iframe
    Given I navigate to The Internet Herokuapp
    When I go to the "iframe" page
    And I click on the iFrame link
    Then I should see the message Your content goes here

