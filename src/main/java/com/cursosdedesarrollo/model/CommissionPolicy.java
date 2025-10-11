package com.cursosdedesarrollo.model;

import java.math.BigDecimal;

public class CommissionPolicy {
    private String tipo;           // "fija" o "porcentaje"
    private BigDecimal importe;    // fija en €, o porcentaje (0.02 => 2%)

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public BigDecimal getImporte() { return importe; }
    public void setImporte(BigDecimal importe) { this.importe = importe; }

    public BigDecimal calcular(BigDecimal monto) {
        if ("fija".equalsIgnoreCase(tipo)) return importe;
        if ("porcentaje".equalsIgnoreCase(tipo)) return monto.multiply(importe);
        return BigDecimal.ZERO;
    }
}

