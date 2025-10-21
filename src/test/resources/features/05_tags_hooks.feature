# Revisa el Fichero CalculadoraSteps, SaldosStep y PolicySteps
# Definimos etiquetas para su ejecución
@limpio
Feature: Escenarios que requieren estado limpio

  Background:
    Given existen las siguientes cuentas:
      | id | titular | saldo |
      | X  | Xi      | 10    |
      | Y  | Ya      | 20    |

  @critico
  Scenario: Un caso crítico
    When transfiero 10 de la cuenta "X" a "Y"
    Then el saldo de "X" es 0
    And el saldo de "Y" es 30

  Scenario: Un caso normal
    When transfiero 10 de la cuenta "Y" a "X"
    Then el saldo de "X" es 20