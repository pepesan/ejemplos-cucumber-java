# Revisa el Fichero CalculadoraSteps
Feature: Operaciones básicas de la calculadora
  La calculadora debe poder sumar, restar y multiplicar números enteros.

  Scenario: Sumar dos números
    Given que tengo una calculadora
    And que el valor inicial es 2
    When sumo 3
    Then el resultado debe ser 5

  Scenario: Restar un número
    Given que tengo una calculadora
    And que el valor inicial es 10
    When resto 4
    Then el resultado debe ser 6

  Scenario: Multiplicar un número
    Given que tengo una calculadora
    And que el valor inicial es 3
    When multiplico por 5
    Then el resultado debe ser 15
