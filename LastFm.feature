Feature: joining Last.Fm

  Scenario: User becomes NEW Member on Last.Fm
    Given open last.fm join page and accepted cookies
    When User fills out correctly Username field
    And User fills out correctly Email field
    And User fills out correctly Password field
    And User fills out correctly Confirm Password field
    And Accepts terms and tickets i'm not robot
    Then User submits by clicking Create my account
    And User becomes a member
