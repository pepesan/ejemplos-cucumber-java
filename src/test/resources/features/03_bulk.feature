Feature: Alta masiva de cuentas

  Scenario: Crear varias cuentas de una vez
    Given existen las siguientes cuentas:
      | id | titular | saldo |
      | C  | Carla   | 200   |
      | D  | Dario   | 300   |
    Then el saldo de "C" es 200
    And el saldo de "D" es 300
