Feature: As a official I want to be able to record branch results so I can get the points Decathlon

  @track
  Scenario Outline:    I want to record 100m and get results

    Given    I have entered track <results> in seconds
    When    I ask for results
    Then    I should get track <points> back
    Examples:
      | results | points |
      | 12      | 651    |
      | 18      | 0      |
      | 11.7    | 711    |

  @length
  Scenario Outline:    I want to record cm
    Given I ask for cm <result>
    When I ask for cm results
    Then    i should get cm <points> back
    Examples:
      | result | points |
      | 500.1  | 383    |
      | 40     | 0      |






