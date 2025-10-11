Feature: Políticas de comisión desde JSON

  Background:
    Given existen las siguientes cuentas:
      | id | titular | saldo |
      | A  | Ana     | 1000  |
      | B  | Beto    | 500   |

  Scenario: Comisión fija
    Given la política de comisiones es:
      """
      {
        "tipo": "fija",
        "importe": 2
      }
      """
    When transfiero 100 de la cuenta "A" a "B"
    Then el saldo de "A" es 898
    And el saldo de "B" es 600
