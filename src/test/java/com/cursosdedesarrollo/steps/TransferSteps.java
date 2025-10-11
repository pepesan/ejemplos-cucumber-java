package com.cursosdedesarrollo.steps;

import io.cucumber.java.es.Cuando;

import java.math.BigDecimal;

public class TransferSteps {
    private final World world;

    public TransferSteps(World world) { this.world = world; }

    @Cuando("transfiero {int} de la cuenta {string} a {string}")
    public void transfiero_de_a(int monto, String origen, String destino) {
        world.bank.transferir(new BigDecimal(monto), origen, destino);
    }
}

