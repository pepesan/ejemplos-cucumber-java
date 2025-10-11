Feature: Transferencias parametrizadas

  Background:
    Given existen las siguientes cuentas:
      | id | titular | saldo |
      | A  | Ana     | 1000  |
      | B  | Beto    | 500   |

  Scenario Outline: Transferir <monto> de <origen> a <destino>
    When transfiero <monto> de la cuenta "<origen>" a "<destino>"
    Then el saldo de "<origen>" es <saldoOrigen>
    And el saldo de "<destino>" es <saldoDestino>

    Examples:
      | monto | origen | destino | saldoOrigen | saldoDestino |
      | 100   | A      | B       | 900         | 600          |
      | 50    | B      | A       | 450         | 1050         |
