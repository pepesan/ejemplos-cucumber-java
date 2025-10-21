# Revisa el Fichero SaldosStep
Feature: Alta masiva de cuentas

  Scenario: Crear varias cuentas de una vez
    Given carga datos iniciales:
      | id | titular | saldo |
      | A  | Ana     | 1000  |
      | B  | Beto    | 500   |
    Then la persona "Ana" tiene saldo 1000
    And la persona "Beto" tiene saldo 500
