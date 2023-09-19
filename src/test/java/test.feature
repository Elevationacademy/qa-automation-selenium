Feature: The is a feature


  Scenario: Scenario 1
    When User enter credentials
      | username   | password |
      | testuser_1 | Test@123 |
      | testuser_2 | Test@456 |

  Scenario Outline: Scenario 2
    Given Print "<param>"

    Examples:
      | param |
      | this  |
      | that  |

  Scenario: Test Context
    When Put 'Something' in context key 'Thing'
    Then Context key 'Thing' has value 'Something'

    Scenario: Create user and login
      Given I create a random user
      When I login with the random user
      Then I am logged in

      Scenario: API test
        When Via API - I create a user
        |user| password| id|
        |A   |abca     |12 |
        |B   | 123123  |13 |
        Then Api call with id 12 has status 200
        Then Api call with id 13 has status 404
