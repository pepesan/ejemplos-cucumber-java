package com.cursosdedesarrollo.model;

import java.math.BigDecimal;
import java.util.*;

public class Bank {
    private final Map<String, Account> cuentas = new HashMap<>();
    private CommissionPolicy policy;

    public void reset() { cuentas.clear(); policy = null; }
    public void add(Account a) { cuentas.put(a.getId(), a); }
    public Account get(String id) { return Optional.ofNullable(cuentas.get(id))
            .orElseThrow(() -> new IllegalArgumentException("No existe cuenta: " + id)); }

    public void setPolicy(CommissionPolicy policy) { this.policy = policy; }

    public void transferir(BigDecimal monto, String origen, String destino) {
        Account o = get(origen);   // antes: var o = get(origen);
        Account d = get(destino);  // antes: var d = get(destino);
        BigDecimal comision = (policy != null) ? policy.calcular(monto) : BigDecimal.ZERO; // ok
        o.carga(monto.add(comision));
        d.abona(monto);
    }

}

