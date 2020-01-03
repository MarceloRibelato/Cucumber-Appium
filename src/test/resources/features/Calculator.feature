#language: en

@calculator
Feature: Execute numeric operations

  I am as a user want to execute numeric operations in my simple calculator

  Scenario Outline: Sum two numbers
    Given the user types the first number"<first_Number>" and second number"<second_number>"
    When the user clicks on sum button
    Then the result should be displayed "<expected_result>"
    Examples:
      | first_Number | second_number | expected_result |
      | 10           | 25            | 55              |
      | 30           | 25            | 55              |