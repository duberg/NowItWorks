Feature: I need to be able to add contestants so I can log their results

  @gender
  Scenario Outline: add your gender

    Given    I have also entered gender"<gender>" and <sheetNum> is assigned
    When    I press enter
    Then    result "<result>" should be displayed on the screen for gender "<gender>" and <sheetNum>
    Examples:
      | gender | result | sheetNum |
      | F      | F      | 1        |