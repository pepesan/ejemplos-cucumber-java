package com.cursosdedesarrollo.steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class HooksTags {
    private final World world;
    public HooksTags(World world) { this.world = world; }

    @Before("@limpio")
    public void beforeLimpio(Scenario sc) {
        System.out.println("Hook Before para Limpio");
        world.bank.reset();
    }
    @After("@limpio")
    public void afterLimpio(Scenario sc) {
        System.out.println("Hook After para Limpio");
    }
}
