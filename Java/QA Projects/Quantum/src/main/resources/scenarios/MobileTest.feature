#MobileTest Feature File
Feature: editing wifi settings

  @edit_settings
  Scenario: turn wifi setting to off
    Given I am in the wifi settings
    And the wifi slider is in the on position
    When I click on the wifi slider
    Then wifi should be in the off position
    