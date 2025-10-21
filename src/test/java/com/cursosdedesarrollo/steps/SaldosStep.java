package com.cursosdedesarrollo.steps;

import com.cursosdedesarrollo.model.Account;
import io.cucumber.java.DataTableType;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SaldosStep {
    List<Account> cuentas;

    @DataTableType
    public Account cuenta(Map<String, String> row) {
        return new Account(row.get("id"), row.get("titular"), new BigDecimal(row.get("saldo")));
    }

    @Given("carga datos iniciales:")
    public void cargaDatosIniciales(List<Account> cuentas) {
        this.cuentas = cuentas;
    }

    @Then("la persona {string} tiene saldo {int}")
    public void laPersonaTieneSaldo(String persona, int saldo) {
        Account cuenta = this.cuentas.stream()
                .filter(c -> c.getTitular().equals(persona))
                .findFirst()
                .orElse(null);
        assertNotNull( cuenta );
        assertEquals(cuenta.getSaldo(), new BigDecimal(saldo));
    }
}
