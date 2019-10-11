Feature: Search_with_example
@exampletest
  Scenario Outline: Giving the User feature with example
    Given User has to be the the HoePage
    When They'll click the search buttom to "<items>"they want to find
    Then User will get "<expected>" result
  Examples:
  |items|expected|
  |pants|0 results have been found.|
  |shirt|1 result has been found. |