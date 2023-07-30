Feature: The is a feature

  Scenario: Scenario 1
    When User enter credentials
      | username   | password |
      | testuser_1 | Test@123 |
      | testuser_2 | Test@456 |

    Scenario Outline: Scenario 2
      Given Print "<param>"

      Examples:
      |param|
      |this |
      |that |

      Scenario: Test Context
        When Put 'Something' in context key 'Thing'
        Then Context key 'Thing' has value 'Something'