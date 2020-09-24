Feature: Search of various products category

  Scenario: User should be able to search product under books category
    Given User visit the website as guest user
    When User select books option from the drowpdwon
    And User click on search icon option
    Then User should see the page having haeading as Amaxon Best Reading is displayed
    But USer should not see the other category prodcuts

  Scenario: User should be able to search product under baby category
    Given User visit the website as guest user
    When User select baby option from the drowpdwon
    And User click on search icon option
    Then User should see the page having haeading as Offer on Baby's Products is displayed
    But USer should not see the other category prodcuts
