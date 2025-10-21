Feature: Funcionalidad a probar
  Background:
    Given que tengo una calculadora
    And que el valor inicial es 2

  Scenario:
    When sumo 3
    Then el resultado debe ser 5
  Scenario:
    When sumo 4
    Then el resultado debe ser 6