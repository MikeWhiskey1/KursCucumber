Feature: Google Search

  Scenario: user can search any keyword
    Given an open browser with google.com
    When "Selenium" word has been written into input field and submitted
    Then the first one contains "Selenium" result
    And close browser