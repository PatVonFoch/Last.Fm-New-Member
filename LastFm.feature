Feature: joining Last.Fm

  Scenario Outline: User becomes NEW Member on Last.Fm
    Given open last.fm join page and accepted cookies
    When User fills out correctly Username field with "<username>"
    And User fills out correctly Email field with "<email address>"
    And User fills out correctly Password field with "<password>"
    And User fills out correctly Confirm Password field with "<PassConf>"
    And Accepts terms and tickets i'm not robot
    Then User submits by clicking Create my account
    And User becomes a member

    Examples:
      |username|email address|password|PassConf|
      |Ninogniew|nino@mail.co|qwer5%|qwer5%|
      |Tomira|tomi@mail.co|asdf8*|asdf8*|
