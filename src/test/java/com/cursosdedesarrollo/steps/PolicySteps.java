package com.cursosdedesarrollo.steps;

import com.cursosdedesarrollo.model.CommissionPolicy;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Dado;

public class PolicySteps {
    private final World world;
    private final ObjectMapper mapper = new ObjectMapper();

    public PolicySteps(World world) { this.world = world; }

    @Dado("la política de comisiones es:")
    public void la_politica_de_comisiones_es(String docStringJson) throws Exception {
        CommissionPolicy p = mapper.readValue(docStringJson, CommissionPolicy.class);
        world.policy = p;
        world.bank.setPolicy(p);
    }
}

