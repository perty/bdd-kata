Feature: General business rules

  Scenario: Item degrades by one per day
    Given an item with quality 10 and sell by date tomorrow
    When 1 day passed
    Then the item has quality 9
    And the item has sell by date today
