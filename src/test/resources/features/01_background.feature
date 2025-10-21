# Revisa el Fichero AccountSetupSteps y SaldosStep
Feature: Operaciones bancarias con estado común

  Background:
    Given existen las siguientes cuentas:
      | id | titular | saldo |
      | A  | Ana     | 1000  |
      | B  | Beto    | 500   |

  Scenario: Consulta de saldos iniciales
    Then el saldo de "A" es 1000
    And el saldo de "B" es 500

  Scenario: Consulta de saldos iniciales
    Then el saldo de "A" es 1000
    And el saldo de "B" es 500
