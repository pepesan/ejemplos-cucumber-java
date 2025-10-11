package com.cursosdedesarrollo.model;

import java.math.BigDecimal;

public class Account {
    private final String id;
    private final String titular;
    private BigDecimal saldo;

    public Account(String id, String titular, BigDecimal saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getId() { return id; }
    public String getTitular() { return titular; }
    public BigDecimal getSaldo() { return saldo; }
    public void abona(BigDecimal x) { saldo = saldo.add(x); }
    public void carga(BigDecimal x) { saldo = saldo.subtract(x); }
}
