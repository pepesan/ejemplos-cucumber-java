package com.cursosdedesarrollo.steps;

import com.cursosdedesarrollo.model.Account;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountSetupSteps {
    private final World world;

    public AccountSetupSteps(World world) { this.world = world; }

    @DataTableType
    public Account cuenta(Map<String, String> row) {
        return new Account(row.get("id"), row.get("titular"), new BigDecimal(row.get("saldo")));
    }

    @Dado("existen las siguientes cuentas:")
    public void existen_las_siguientes_cuentas(List<Account> cuentas) {
        world.bank.reset();
        cuentas.forEach(world.bank::add);
    }

    @Entonces("el saldo de {string} es {int}")
    public void el_saldo_de_es(String id, Integer esperado) {
        assertEquals(0, world.bank.get(id).getSaldo()
                .compareTo(new BigDecimal(esperado)));
    }
}

