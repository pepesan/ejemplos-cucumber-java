package com.cursosdedesarrollo.steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    private final World world;
    public Hooks(World world) { this.world = world; }

    @Before("@limpio")
    public void beforeLimpio(Scenario sc) {
        world.bank.reset();
    }
}
