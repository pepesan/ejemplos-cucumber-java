Feature: Operaciones básicas de la calculadora
  La calculadora debe poder sumar, restar y multiplicar números enteros.

  Scenario Outline: Sumar dos números
    Given que tengo una calculadora
    And que el valor inicial es <init>
    When sumo <suma>
    Then el resultado debe ser <resultado>
    Examples:
      | init  | suma | resultado |
      | 2  | 3 | 5 |
      | 2  | 4 | 6 |
      | 4  | 3 | 7 |