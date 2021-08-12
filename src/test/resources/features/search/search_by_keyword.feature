Feature: Search by keyword

  Scenario: login
    Given Hoang is researching things on the internet
    When he enter email "mailinator02@mailinator.com"
    When he enter pass "12345678a"
    Then she should see information about "Mailinator 02"

  Scenario: post
    Given Hoang click title post
    When he enter post detail "Autotest"
    When he click share


