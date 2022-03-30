Feature: Counting of the Vowel and Consonant

Scenario: Counting the vowel and consonant
  When I pass the string
    | Kevin, Patel |
    | Patel        |
    | Grammar      |
    | Awesome      |
  Then I should see the count of the vowel and consonant

  Scenario: Negative Scenario
    When I pass more than 4 string
      | Kevin, Patel |
      | Patel        |
      | Grammar      |
      | Awesome      |
      | Awesome      |
    Then I should see the error

