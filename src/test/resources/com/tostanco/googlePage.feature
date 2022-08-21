Feature: Basic test
@SmokeTest
  Scenario: page works
    Given Page is loaded
    When I click button
    Then notification will disappear
