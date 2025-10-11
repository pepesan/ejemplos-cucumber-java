package com.cursosdedesarrollo.steps;

import com.cursosdedesarrollo.model.Bank;
import com.cursosdedesarrollo.model.CommissionPolicy;

public class World {
    public final Bank bank = new Bank();
    public CommissionPolicy policy; // opcional según escenario

    public World() {} // 👈 necesario para DI
}

