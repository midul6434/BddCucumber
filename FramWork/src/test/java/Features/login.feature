Feature: login
  @logintest
  Scenario Outline: User will try the use the invalid input
    Given user has to be in the log in page
    When User will put the "<username>" &"<password>"
    Then It will say Authentication failed.
    Examples:
    |username|password|
    |tlover781@gmail.com|725367272|
    |myname@gmail.com   |7t4748   |
